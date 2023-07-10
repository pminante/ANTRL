package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Compilador {
    private String entrada;

    public Compilador(String entrada) {
        this.entrada = entrada;
    }

    public void compile(){
        CharStream input = CharStreams.fromString(this.entrada);
        SyntacticLexer lexer = new SyntacticLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            int tokenType = token.getType();
            String tokenName = lexer.getVocabulary().getSymbolicName(tokenType);
            String tokenText = token.getText();
            int line = token.getLine();
            int column = token.getCharPositionInLine();
            System.out.println("Token: " + tokenName + " | Texto: " + tokenText + " | Linha: " + line + " | Coluna: " + column);
        }
        SyntacticParser parser = new SyntacticParser(tokens);
        ParseTree tree = parser.program();
    }
}
