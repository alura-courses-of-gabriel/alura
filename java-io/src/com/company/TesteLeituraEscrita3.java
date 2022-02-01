package com.company;

import java.io.IOException;
import java.io.PrintStream;

public class TesteLeituraEscrita3 {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("lorem2.txt");
        printStream.println("Usado o printStream");
        printStream.println();
        printStream.println();
        printStream.print("Finalizando o arquivo");

        printStream.close();

    }
}
