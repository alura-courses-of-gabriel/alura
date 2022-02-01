package com.company;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel Menezes");
        cliente.setCpf("00000000000");
        cliente.setProfissao("Desenvolvedor de Software");
        cliente.setContato(new Contato("3333-3333", "email.com"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        cliente = (Cliente) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(cliente.getNome());

        Contato contato = new Contato("telefone", "email") {
            @Override
            public String toString() {
                return super.getTelefone() + " : " + super.getEmail();
            }
        };
        System.out.println(contato);
    }
}
