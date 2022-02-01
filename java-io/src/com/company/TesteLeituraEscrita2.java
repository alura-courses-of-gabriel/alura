package com.company;

import java.io.*;

public class TesteLeituraEscrita2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("lorem2.txt");
        fileWriter.write("Usando FileWriter e escrevendo");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("Finalizando o arquivo");

        fileWriter.close();

    }
}
