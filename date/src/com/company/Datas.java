package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate estreiaMundialPalmeiras = LocalDate.of(2022, Month.FEBRUARY, 8);

        System.out.println(Period.between(hoje, estreiaMundialPalmeiras).getDays());

        System.out.println(estreiaMundialPalmeiras.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));

        LocalTime horaDoJogo = LocalTime.of(12, 30);
        System.out.println(horaDoJogo);
    }
}
