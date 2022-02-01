package com.company;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Escrevendo no arquivo");
        bufferedWriter.newLine();
        bufferedWriter.write("End of file");

        bufferedWriter.close();
    }
}
