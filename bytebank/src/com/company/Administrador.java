package com.company;

public class Administrador extends Funcionario implements Autenticavel{

    private final AutenticacaoUtils autenticacaoUtils;

    public Administrador() {
        this.autenticacaoUtils = new AutenticacaoUtils();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
