# PLD Comp

## Useful commands

### Build
```
make clean
make
```

### ANTLR Code Generation

```
antlr4 -visitor -no-listener -Dlanguage=Cpp PLDComp.g4
```

### Testing command

```
./comp irtest.c && as -o out.o out.asm && gcc out.o && ./a.out
echo $?
```
