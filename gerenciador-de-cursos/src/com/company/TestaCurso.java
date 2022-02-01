package com.company;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando coleções em Java", "Paulo Silveira");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com Coleções", 22));

    }
}
