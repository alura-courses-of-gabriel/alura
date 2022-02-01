package com.company;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String nome = "Gabriel Santana de Menezes";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objectOutputStream.bin"));
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectOutputStream.bin"));
        String output = (String) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(output);
    }
}
