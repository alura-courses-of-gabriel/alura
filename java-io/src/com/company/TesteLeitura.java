package com.company;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStream fileInputStream = new FileInputStream("lorem.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
//        BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);
        BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);

        String linha = bufferedInputStream.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = bufferedInputStream.readLine();
        }

        bufferedInputStream.close();
    }
}
