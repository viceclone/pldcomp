#include "IRGenerator.h"
#include "antlr4-runtime.h"
#include "PLDCompBaseVisitor.h"
#include "PLDCompParser.h"
#include "IR.h"
using namespace std;
using namespace antlr4;

void IRGenerator::output_asm(ostream& o) {
    cout << "--------------------OUTPUT TO OUT.ASM--------" << endl;
    o << ".text" << endl << endl;
    for (auto it=cfg_list.begin();it!=cfg_list.end();++it) {
        it->second->gen_asm(o);
    }
    cout << "--------------------END OUTPUT TO OUT.ASM--------" << endl;
}

antlrcpp::Any IRGenerator::visitProg(PLDCompParser::ProgContext *ctx) {
    return visitChildren(ctx);
}

/*
antlrcpp::Any IRGenerator::visitFuncNoParams(PLDCompParser::FuncNoParamsContext *ctx) {
    string name = ctx->ID()->getText();
    CFG* cfg = new CFG();
    cfg->label = name;
    cfg_list[name] = cfg;
    BasicBlock* bb = new BasicBlock(cfg, name);
    bb->exit_true = nullptr;
    bb->exit_false = nullptr;
    cfg->add_bb(bb);
    cfg->current_bb = bb;
    current_cfg = cfg;
    cout << reg_name[0] << endl;
    visit(ctx->statementseq());
    return NULL;
}
*/
antlrcpp::Any IRGenerator::visitFunctiondefinition(PLDCompParser::FunctiondefinitionContext *ctx) {
    string name = ctx->ID(0)->getText();
    CFG* cfg = new CFG();
    cfg->label = name;
    cfg_list[name] = cfg;
    BasicBlock* bb = new BasicBlock(cfg, name);
    bb->exit_true = nullptr;
    bb->exit_false = nullptr;
    cfg->add_bb(bb);
    cfg->current_bb = bb;
    current_cfg = cfg;

    // Can merge with visitFuncNoParams -> TODO
    int n_params = (ctx->ID()).size()-1;
    current_cfg->set_n_params(n_params);
    vector<PLDCompParser::TypeContext *> type = ctx->type();
    vector<tree::TerminalNode*> list_id = ctx->ID();
    // Parameters of the function are returned in list_id[1] to list[n_params]
    for (int i=1; i<=n_params; i++) {
        string name = list_id[i]->getText();
        // We dont care about type this time
        // string t = type[i]->getText();
        bool valid = current_cfg->add_to_symbol_table(name,Int);
        if (!valid) {
            cout << "ERROR: Variable name " << name <<  " is redundant";
            return NULL;
        }
        current_cfg->add_param(name, Int);
    }
    visit(ctx->statementseq());
    return NULL;
}

antlrcpp::Any IRGenerator::visitCallNoParams(PLDCompParser::CallNoParamsContext *ctx) {
    return NULL;
}

antlrcpp::Any IRGenerator::visitCallWithParams(PLDCompParser::CallWithParamsContext *ctx) {
    return NULL;
}

antlrcpp::Any IRGenerator::visitStatementseq(PLDCompParser::StatementseqContext *ctx) {
    return visitChildren(ctx);
}

antlrcpp::Any IRGenerator::visitStatement(PLDCompParser::StatementContext *ctx)  {
    return visitChildren(ctx);
}

antlrcpp::Any IRGenerator::visitReturnstatement(PLDCompParser::ReturnstatementContext *ctx) {
    string var = visit(ctx->expr());
    vector<string> params = {var};
    current_cfg->current_bb->add_IRInstr(IRInstr::ret,Int,params);
    return var;
}


// Expression
antlrcpp::Any IRGenerator::visitConst(PLDCompParser::ConstContext *ctx) {
    string var = current_cfg->create_new_tempvar(Int);
    vector<string> params = {var,ctx->INT()->getText()};
    current_cfg->current_bb->add_IRInstr(IRInstr::ldconst,Int,params);
    return var;
}

antlrcpp::Any IRGenerator::visitNegConst(PLDCompParser::NegConstContext *ctx) {
    string var = current_cfg->create_new_tempvar(Int);
    vector<string> params = {var,("-"+ctx->INT()->getText())};
    current_cfg->current_bb->add_IRInstr(IRInstr::ldconst,Int,params);
    return var;
}

antlrcpp::Any IRGenerator::visitPar(PLDCompParser::ParContext *ctx) {
    string var = visit(ctx->expr());
    return var;
}

antlrcpp::Any IRGenerator::visitVar(PLDCompParser::VarContext *ctx) {
    return (string)(ctx->ID()->getText());
}

antlrcpp::Any IRGenerator::visitNegExpr(PLDCompParser::NegExprContext *ctx) {
    int address = current_cfg->get_current_address();
    current_cfg->reset_next_temp(0);
    string var = visit(ctx->expr());
    current_cfg->reset_next_temp(4);
    string temp = current_cfg->create_new_tempvar(Int);
    vector<string> params = {temp,"0"};
    current_cfg->current_bb->add_IRInstr(IRInstr::ldconst,Int,params);
    params = {var,temp,var};
    current_cfg->current_bb->add_IRInstr(IRInstr::sub,Int,params);
    return var;
}

antlrcpp::Any IRGenerator::visitMultiplicativeOp(PLDCompParser::MultiplicativeOpContext *ctx) {
    int address = current_cfg->get_current_address();
    current_cfg->reset_next_temp(0);
    string var1 = visit(ctx->expr(0));
    current_cfg->reset_next_temp(4);
    string var2 = visit(ctx->expr(1));
    current_cfg->reset_next_temp(0);
    string var3 = current_cfg->create_new_tempvar(Int);
    vector<string> params = {var3, var1, var2};
    IRInstr::Operation op;
    if (ctx->op->getText().compare("*") == 0) {
        op = IRInstr::mul;
    }
    current_cfg->current_bb->add_IRInstr(op,Int,params);
    return var3;
}

antlrcpp::Any IRGenerator::visitAdditiveOp(PLDCompParser::AdditiveOpContext *ctx) {
    int address = current_cfg->get_current_address();
    current_cfg->reset_next_temp(0);
    string var1 = visit(ctx->expr(0));
    current_cfg->reset_next_temp(4);
    string var2 = visit(ctx->expr(1));
    current_cfg->reset_next_temp(0);
    string var3 = current_cfg->create_new_tempvar(Int);
    vector<string> params = {var3, var1, var2};
    IRInstr::Operation op;
    if (ctx->op->getText().compare("+") == 0) {
        op = IRInstr::add;
    } else if (ctx->op->getText().compare("-") == 0) {
        op = IRInstr::sub;
    }
    current_cfg->current_bb->add_IRInstr(op,Int,params);
    return var3;
}

// Variable declaration
antlrcpp::Any IRGenerator::visitDeclWithoutAssignment(PLDCompParser::DeclWithoutAssignmentContext *ctx) {
    string name = ctx->ID()->getText();
    string type = ctx->type()->getText();
    Type t;
    if (type.compare("int") == 0) {
        t = Int;
    }
    bool validDeclaration = current_cfg->add_to_symbol_table(name,t);
    if (!validDeclaration) {
        cout << "ERROR: invalid declaration " << endl;
    }
    current_cfg->reset_next_temp(0);
    return NULL;
}


antlrcpp::Any IRGenerator::visitDeclWithAssignment(PLDCompParser::DeclWithAssignmentContext *ctx) {
    string name = ctx->ID()->getText();
    string type = ctx->type()->getText();
    Type t;
    if (type.compare("int") == 0) {
        t = Int;
    }
    bool validDeclaration = current_cfg->add_to_symbol_table(name,t);
    if (!validDeclaration) {
        cout << "ERROR: invalid declaration " << endl;
        return NULL;
    }
    current_cfg->reset_next_temp(0);
    string temp = visit(ctx->expr());
    vector<string> params = {name, temp};
    current_cfg->current_bb->add_IRInstr(IRInstr::cpy,Int,params);
    return NULL;
}

// Assignment
antlrcpp::Any IRGenerator::visitAssignmentExpr(PLDCompParser::AssignmentExprContext *ctx) {
    string name = ctx->ID()->getText();
    if (current_cfg->find_symbol(name)) {
        string temp = visit(ctx->expr());
        vector<string> params = {name, temp};
        current_cfg->current_bb->add_IRInstr(IRInstr::cpy,Int,params);
    } else {
        cout << "ERROR: variable has not been declared yet" << endl;
    }
    return NULL;
}
// Type
antlrcpp::Any IRGenerator::visitType(PLDCompParser::TypeContext *ctx) {
    return visitChildren(ctx);
}

