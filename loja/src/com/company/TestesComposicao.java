package com.company;

import com.company.orcamento.ItemOrcamento;
import com.company.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
    }
}
