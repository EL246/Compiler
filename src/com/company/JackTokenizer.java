package com.company;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class JackTokenizer {
    private final File jackFile;

//    TODO: is it more efficient to not keep a list?
    private List<JackToken> tokens;

    private static List<String> symbols = Arrays.asList("{", "}", "(", ")", "[", "]", ".",
            ",", ";", "+", "-", "*", "/", "&", "|", "<", ">", "=", "~");

    private static List<String> keywords = Arrays.asList("class", "constructor", "function", "method",
            "field", "static", "var", "int", "char", "boolean", "void", "true", "false", "null", "this", "let",
            "do", "if", "else", "while", "return");

    JackTokenizer(File jackFile) throws AnalyzerException {
        this.jackFile = jackFile;
        this.tokens = new LinkedList<>();
        init();
    }

    private void init() throws AnalyzerException {
        Scanner scanner;
        try {
            scanner = new Scanner(jackFile);
        } catch (FileNotFoundException e) {
            throw new AnalyzerException("Please specify a valid jack file");
        }
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            s = s.replaceAll("//(.*)","");
            System.out.println("token: " + s + " length: " + s.length());
//            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(),"{}()[].,;+-*/&|<>=~", true);
        }

    }

    boolean hasMoreTokens() {
        throw new NotImplementedException();
    }

    void advance() {
        throw new NotImplementedException();
    }

    void tokenType() {
        throw new NotImplementedException();
    }

    void keyWord() {
        throw new NotImplementedException();
    }

    Character symbol() {
        throw new NotImplementedException();
    }

    String identifier() {
        throw new NotImplementedException();
    }

    Integer intVal() {
        throw new NotImplementedException();
    }

    String stringVal() {
        throw new NotImplementedException();
    }
}
