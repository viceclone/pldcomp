
// Generated from PLDComp.g4 by ANTLR 4.7.2


#include "PLDCompLexer.h"


using namespace antlr4;


PLDCompLexer::PLDCompLexer(CharStream *input) : Lexer(input) {
  _interpreter = new atn::LexerATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

PLDCompLexer::~PLDCompLexer() {
  delete _interpreter;
}

std::string PLDCompLexer::getGrammarFileName() const {
  return "PLDComp.g4";
}

const std::vector<std::string>& PLDCompLexer::getRuleNames() const {
  return _ruleNames;
}

const std::vector<std::string>& PLDCompLexer::getChannelNames() const {
  return _channelNames;
}

const std::vector<std::string>& PLDCompLexer::getModeNames() const {
  return _modeNames;
}

const std::vector<std::string>& PLDCompLexer::getTokenNames() const {
  return _tokenNames;
}

dfa::Vocabulary& PLDCompLexer::getVocabulary() const {
  return _vocabulary;
}

const std::vector<uint16_t> PLDCompLexer::getSerializedATN() const {
  return _serializedATN;
}

const atn::ATN& PLDCompLexer::getATN() const {
  return _atn;
}




// Static vars and initialization.
std::vector<dfa::DFA> PLDCompLexer::_decisionToDFA;
atn::PredictionContextCache PLDCompLexer::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PLDCompLexer::_atn;
std::vector<uint16_t> PLDCompLexer::_serializedATN;

std::vector<std::string> PLDCompLexer::_ruleNames = {
  u8"T__0", u8"RETURN", u8"INT_TYPE", u8"ID", u8"INT", u8"ASSIGN", u8"SEMICOLON", 
  u8"RIGHT_BRACE", u8"LEFT_BRACE", u8"LEFT_PARENTHESE", u8"RIGHT_PARENTHESE", 
  u8"PLUS", u8"MINUS", u8"STAR", u8"DIV", u8"MOD", u8"WHITESPACE", u8"NEWLINE", 
  u8"BLOCKCOMMENT", u8"LINECOMMENT", u8"ERROR"
};

std::vector<std::string> PLDCompLexer::_channelNames = {
  "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
};

std::vector<std::string> PLDCompLexer::_modeNames = {
  u8"DEFAULT_MODE"
};

std::vector<std::string> PLDCompLexer::_literalNames = {
  "", u8"','", u8"'return'", u8"'int'", "", "", u8"'='", u8"';'", u8"'}'", 
  u8"'{'", u8"'('", u8"')'", u8"'+'", u8"'-'", u8"'*'", u8"'/'", u8"'%'"
};

std::vector<std::string> PLDCompLexer::_symbolicNames = {
  "", "", u8"RETURN", u8"INT_TYPE", u8"ID", u8"INT", u8"ASSIGN", u8"SEMICOLON", 
  u8"RIGHT_BRACE", u8"LEFT_BRACE", u8"LEFT_PARENTHESE", u8"RIGHT_PARENTHESE", 
  u8"PLUS", u8"MINUS", u8"STAR", u8"DIV", u8"MOD", u8"WHITESPACE", u8"NEWLINE", 
  u8"BLOCKCOMMENT", u8"LINECOMMENT", u8"ERROR"
};

dfa::Vocabulary PLDCompLexer::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> PLDCompLexer::_tokenNames;

PLDCompLexer::Initializer::Initializer() {
  // This code could be in a static initializer lambda, but VS doesn't allow access to private class members from there.
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x2, 0x17, 0x87, 0x8, 0x1, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 
    0x4, 0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
    0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 
    0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 
    0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 
    0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 
    0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 
    0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x3d, 0xa, 
    0x5, 0xc, 0x5, 0xe, 0x5, 0x40, 0xb, 0x5, 0x3, 0x6, 0x6, 0x6, 0x43, 0xa, 
    0x6, 0xd, 0x6, 0xe, 0x6, 0x44, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 
    0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x12, 0x6, 0x12, 0x5e, 
    0xa, 0x12, 0xd, 0x12, 0xe, 0x12, 0x5f, 0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 
    0x3, 0x13, 0x5, 0x13, 0x66, 0xa, 0x13, 0x3, 0x13, 0x5, 0x13, 0x69, 0xa, 
    0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
    0x7, 0x14, 0x71, 0xa, 0x14, 0xc, 0x14, 0xe, 0x14, 0x74, 0xb, 0x14, 0x3, 
    0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 
    0x3, 0x15, 0x3, 0x15, 0x7, 0x15, 0x7f, 0xa, 0x15, 0xc, 0x15, 0xe, 0x15, 
    0x82, 0xb, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x72, 
    0x2, 0x17, 0x3, 0x3, 0x5, 0x4, 0x7, 0x5, 0x9, 0x6, 0xb, 0x7, 0xd, 0x8, 
    0xf, 0x9, 0x11, 0xa, 0x13, 0xb, 0x15, 0xc, 0x17, 0xd, 0x19, 0xe, 0x1b, 
    0xf, 0x1d, 0x10, 0x1f, 0x11, 0x21, 0x12, 0x23, 0x13, 0x25, 0x14, 0x27, 
    0x15, 0x29, 0x16, 0x2b, 0x17, 0x3, 0x2, 0x7, 0x5, 0x2, 0x43, 0x5c, 0x61, 
    0x61, 0x63, 0x7c, 0x6, 0x2, 0x32, 0x3b, 0x43, 0x5c, 0x61, 0x61, 0x63, 
    0x7c, 0x3, 0x2, 0x32, 0x3b, 0x4, 0x2, 0xb, 0xb, 0x22, 0x22, 0x4, 0x2, 
    0xc, 0xc, 0xf, 0xf, 0x2, 0x8d, 0x2, 0x3, 0x3, 0x2, 0x2, 0x2, 0x2, 0x5, 
    0x3, 0x2, 0x2, 0x2, 0x2, 0x7, 0x3, 0x2, 0x2, 0x2, 0x2, 0x9, 0x3, 0x2, 
    0x2, 0x2, 0x2, 0xb, 0x3, 0x2, 0x2, 0x2, 0x2, 0xd, 0x3, 0x2, 0x2, 0x2, 
    0x2, 0xf, 0x3, 0x2, 0x2, 0x2, 0x2, 0x11, 0x3, 0x2, 0x2, 0x2, 0x2, 0x13, 
    0x3, 0x2, 0x2, 0x2, 0x2, 0x15, 0x3, 0x2, 0x2, 0x2, 0x2, 0x17, 0x3, 0x2, 
    0x2, 0x2, 0x2, 0x19, 0x3, 0x2, 0x2, 0x2, 0x2, 0x1b, 0x3, 0x2, 0x2, 0x2, 
    0x2, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x2, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x2, 0x21, 
    0x3, 0x2, 0x2, 0x2, 0x2, 0x23, 0x3, 0x2, 0x2, 0x2, 0x2, 0x25, 0x3, 0x2, 
    0x2, 0x2, 0x2, 0x27, 0x3, 0x2, 0x2, 0x2, 0x2, 0x29, 0x3, 0x2, 0x2, 0x2, 
    0x2, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x3, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x5, 0x2f, 
    0x3, 0x2, 0x2, 0x2, 0x7, 0x36, 0x3, 0x2, 0x2, 0x2, 0x9, 0x3a, 0x3, 0x2, 
    0x2, 0x2, 0xb, 0x42, 0x3, 0x2, 0x2, 0x2, 0xd, 0x46, 0x3, 0x2, 0x2, 0x2, 
    0xf, 0x48, 0x3, 0x2, 0x2, 0x2, 0x11, 0x4a, 0x3, 0x2, 0x2, 0x2, 0x13, 
    0x4c, 0x3, 0x2, 0x2, 0x2, 0x15, 0x4e, 0x3, 0x2, 0x2, 0x2, 0x17, 0x50, 
    0x3, 0x2, 0x2, 0x2, 0x19, 0x52, 0x3, 0x2, 0x2, 0x2, 0x1b, 0x54, 0x3, 
    0x2, 0x2, 0x2, 0x1d, 0x56, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x58, 0x3, 0x2, 
    0x2, 0x2, 0x21, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x23, 0x5d, 0x3, 0x2, 0x2, 
    0x2, 0x25, 0x68, 0x3, 0x2, 0x2, 0x2, 0x27, 0x6c, 0x3, 0x2, 0x2, 0x2, 
    0x29, 0x7a, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x85, 0x3, 0x2, 0x2, 0x2, 0x2d, 
    0x2e, 0x7, 0x2e, 0x2, 0x2, 0x2e, 0x4, 0x3, 0x2, 0x2, 0x2, 0x2f, 0x30, 
    0x7, 0x74, 0x2, 0x2, 0x30, 0x31, 0x7, 0x67, 0x2, 0x2, 0x31, 0x32, 0x7, 
    0x76, 0x2, 0x2, 0x32, 0x33, 0x7, 0x77, 0x2, 0x2, 0x33, 0x34, 0x7, 0x74, 
    0x2, 0x2, 0x34, 0x35, 0x7, 0x70, 0x2, 0x2, 0x35, 0x6, 0x3, 0x2, 0x2, 
    0x2, 0x36, 0x37, 0x7, 0x6b, 0x2, 0x2, 0x37, 0x38, 0x7, 0x70, 0x2, 0x2, 
    0x38, 0x39, 0x7, 0x76, 0x2, 0x2, 0x39, 0x8, 0x3, 0x2, 0x2, 0x2, 0x3a, 
    0x3e, 0x9, 0x2, 0x2, 0x2, 0x3b, 0x3d, 0x9, 0x3, 0x2, 0x2, 0x3c, 0x3b, 
    0x3, 0x2, 0x2, 0x2, 0x3d, 0x40, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x3c, 0x3, 
    0x2, 0x2, 0x2, 0x3e, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x3f, 0xa, 0x3, 0x2, 
    0x2, 0x2, 0x40, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x41, 0x43, 0x9, 0x4, 0x2, 
    0x2, 0x42, 0x41, 0x3, 0x2, 0x2, 0x2, 0x43, 0x44, 0x3, 0x2, 0x2, 0x2, 
    0x44, 0x42, 0x3, 0x2, 0x2, 0x2, 0x44, 0x45, 0x3, 0x2, 0x2, 0x2, 0x45, 
    0xc, 0x3, 0x2, 0x2, 0x2, 0x46, 0x47, 0x7, 0x3f, 0x2, 0x2, 0x47, 0xe, 
    0x3, 0x2, 0x2, 0x2, 0x48, 0x49, 0x7, 0x3d, 0x2, 0x2, 0x49, 0x10, 0x3, 
    0x2, 0x2, 0x2, 0x4a, 0x4b, 0x7, 0x7f, 0x2, 0x2, 0x4b, 0x12, 0x3, 0x2, 
    0x2, 0x2, 0x4c, 0x4d, 0x7, 0x7d, 0x2, 0x2, 0x4d, 0x14, 0x3, 0x2, 0x2, 
    0x2, 0x4e, 0x4f, 0x7, 0x2a, 0x2, 0x2, 0x4f, 0x16, 0x3, 0x2, 0x2, 0x2, 
    0x50, 0x51, 0x7, 0x2b, 0x2, 0x2, 0x51, 0x18, 0x3, 0x2, 0x2, 0x2, 0x52, 
    0x53, 0x7, 0x2d, 0x2, 0x2, 0x53, 0x1a, 0x3, 0x2, 0x2, 0x2, 0x54, 0x55, 
    0x7, 0x2f, 0x2, 0x2, 0x55, 0x1c, 0x3, 0x2, 0x2, 0x2, 0x56, 0x57, 0x7, 
    0x2c, 0x2, 0x2, 0x57, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x58, 0x59, 0x7, 0x31, 
    0x2, 0x2, 0x59, 0x20, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5b, 0x7, 0x27, 0x2, 
    0x2, 0x5b, 0x22, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x5e, 0x9, 0x5, 0x2, 0x2, 
    0x5d, 0x5c, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x5f, 
    0x5d, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x3, 0x2, 0x2, 0x2, 0x60, 0x61, 
    0x3, 0x2, 0x2, 0x2, 0x61, 0x62, 0x8, 0x12, 0x2, 0x2, 0x62, 0x24, 0x3, 
    0x2, 0x2, 0x2, 0x63, 0x65, 0x7, 0xf, 0x2, 0x2, 0x64, 0x66, 0x7, 0xc, 
    0x2, 0x2, 0x65, 0x64, 0x3, 0x2, 0x2, 0x2, 0x65, 0x66, 0x3, 0x2, 0x2, 
    0x2, 0x66, 0x69, 0x3, 0x2, 0x2, 0x2, 0x67, 0x69, 0x7, 0xc, 0x2, 0x2, 
    0x68, 0x63, 0x3, 0x2, 0x2, 0x2, 0x68, 0x67, 0x3, 0x2, 0x2, 0x2, 0x69, 
    0x6a, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x6b, 0x8, 0x13, 0x2, 0x2, 0x6b, 0x26, 
    0x3, 0x2, 0x2, 0x2, 0x6c, 0x6d, 0x7, 0x31, 0x2, 0x2, 0x6d, 0x6e, 0x7, 
    0x2c, 0x2, 0x2, 0x6e, 0x72, 0x3, 0x2, 0x2, 0x2, 0x6f, 0x71, 0xb, 0x2, 
    0x2, 0x2, 0x70, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x71, 0x74, 0x3, 0x2, 0x2, 
    0x2, 0x72, 0x73, 0x3, 0x2, 0x2, 0x2, 0x72, 0x70, 0x3, 0x2, 0x2, 0x2, 
    0x73, 0x75, 0x3, 0x2, 0x2, 0x2, 0x74, 0x72, 0x3, 0x2, 0x2, 0x2, 0x75, 
    0x76, 0x7, 0x2c, 0x2, 0x2, 0x76, 0x77, 0x7, 0x31, 0x2, 0x2, 0x77, 0x78, 
    0x3, 0x2, 0x2, 0x2, 0x78, 0x79, 0x8, 0x14, 0x2, 0x2, 0x79, 0x28, 0x3, 
    0x2, 0x2, 0x2, 0x7a, 0x7b, 0x7, 0x31, 0x2, 0x2, 0x7b, 0x7c, 0x7, 0x31, 
    0x2, 0x2, 0x7c, 0x80, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7f, 0xa, 0x6, 0x2, 
    0x2, 0x7e, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x82, 0x3, 0x2, 0x2, 0x2, 
    0x80, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x80, 0x81, 0x3, 0x2, 0x2, 0x2, 0x81, 
    0x83, 0x3, 0x2, 0x2, 0x2, 0x82, 0x80, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 
    0x8, 0x15, 0x2, 0x2, 0x84, 0x2a, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0xb, 
    0x2, 0x2, 0x2, 0x86, 0x2c, 0x3, 0x2, 0x2, 0x2, 0xa, 0x2, 0x3e, 0x44, 
    0x5f, 0x65, 0x68, 0x72, 0x80, 0x3, 0x8, 0x2, 0x2, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

PLDCompLexer::Initializer PLDCompLexer::_init;
