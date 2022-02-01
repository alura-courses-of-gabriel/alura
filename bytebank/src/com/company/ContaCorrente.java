package com.company;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        super.saca(valor + 0.2);
    }
}
