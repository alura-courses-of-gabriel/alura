package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenarStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //ordena
        Collections.sort(palavras, new ComparadorPorTamanho());
        System.out.println(palavras);

        //ordena no Java 8
        palavras.sort(new ComparadorPorTamanho());
        System.out.println(palavras);

        //ordena no Java 8 usando classe anonima
        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                return 0;
            }
        });
        System.out.println(palavras);

        //ordena no Java 8 usando lambda
        palavras.sort((String o1, String o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(palavras);

        //Usando o novo forEach
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Ordena usando comparing + lambda
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));// este é o method reference

        Function<String, Integer> method_reference = String::length;
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }
}
