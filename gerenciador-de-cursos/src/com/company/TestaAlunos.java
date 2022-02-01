package com.company;

public class TestaAlunos {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando coleções em Java", "Paulo Silveira");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com Coleções", 22));

        Aluno aluno1 = new Aluno("Gabriel", 1);
        Aluno aluno2 = new Aluno("Leandro", 2);
        Aluno aluno3 = new Aluno("Tat", 3);

        curso.matricular(aluno1);
        curso.matricular(aluno2);
        curso.matricular(aluno3);

        System.out.println(curso.verificarMatriculado(aluno1));
    }
}
