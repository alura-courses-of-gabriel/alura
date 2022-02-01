package com.company;

public class Aluno {
    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.matricula.equals(aluno.getMatricula());
    }
}
