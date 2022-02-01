package com.company;

import java.util.*;

public class Curso {
    private String nome;
    private String professor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }

    @Deprecated
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public Integer getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Boolean verificarMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
