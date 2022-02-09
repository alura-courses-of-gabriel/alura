package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(curso -> curso.getAlunos()));
        System.out.println(cursos);
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        System.out.println(cursos);

        cursos.stream().filter(curso -> curso.getAlunos() > 50);

        System.out.println(cursos.stream().map(Curso::getNome).toList());

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);


        System.out.println(cursos.stream().mapToInt(Curso::getAlunos).sum());

        System.out.println(cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findAny().get());

    }

}
