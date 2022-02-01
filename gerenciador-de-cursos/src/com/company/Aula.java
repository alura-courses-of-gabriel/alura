package com.company;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private Integer tempo;

    public Aula(String titulo, Integer tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public int compareTo(Aula o) {
        return this.titulo.compareTo(o.titulo);
    }
}
