package com.company;

public enum StatusConta {
    ABERTA(1), FECHADA(0), BLOQUEADA(2);

    private int valor;

    StatusConta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
