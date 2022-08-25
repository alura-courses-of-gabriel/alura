package com.company.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private List<Orcavel> itens;
    private SituacaoOrcamento situacao;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public BigDecimal valor() {
        BigDecimal result = BigDecimal.ZERO;

        for (ItemOrcamento item :this.itens) {
            result = result.add(item.valor());
        }
        return result;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getContadorDeItems() {
        return this.itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDesconto(){
        BigDecimal desconto = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(desconto);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public void adicionaItem(ItemOrcamento item) {
        this.itens.add(item);
    }

}