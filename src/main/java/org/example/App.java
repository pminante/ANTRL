package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App
{
    public static void main( String[] args ) throws IOException {
        String pathName = "test.pas";
        String content = new String(Files.readAllBytes(Paths.get(pathName)));
        Compilador c = new Compilador(content);
        c.compile();
    }
}
