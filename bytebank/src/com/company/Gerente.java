package com.company;

public class Gerente extends Funcionario implements Autenticavel{

    private final AutenticacaoUtils autenticacaoUtils;

    public Gerente() {
        this.autenticacaoUtils = new AutenticacaoUtils();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtils.autenticar(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtils.setSenha(senha);
    }
}
