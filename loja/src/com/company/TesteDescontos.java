package com.company;

import com.company.desconto.CalculadoraDeDescontos;
import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        System.out.println(new CalculadoraDeDescontos().calcular(orcamento1));
        System.out.println(new CalculadoraDeDescontos().calcular(orcamento2));
    }
}
