package com.company;

import java.io.*;

public class TesteLeituraEscrita {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("lorem.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedInputStream.readLine();

        while(linha != null){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedInputStream.readLine();
        }

        bufferedInputStream.close();
        bufferedWriter.close();

    }
}
