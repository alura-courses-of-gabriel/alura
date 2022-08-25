package com.company;

import com.company.http.JavaHTTPClient;
import com.company.orcamento.Orcamento;
import com.company.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHTTPClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
