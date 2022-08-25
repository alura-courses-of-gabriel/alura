package com.company.orcamento;

import com.company.http.HTTPAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HTTPAdapter adapter;

    public RegistroDeOrcamento(HTTPAdapter adapter) {
        this.adapter = adapter;
    }

    public void registrar(Orcamento orcamento) {

        if (orcamento.isFinalizado()){
            throw new RuntimeException("Orcamento não finalizado");
        }

        adapter.post("https://api.externa/dados", Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getContadorDeItems()
        ));
    }
}
