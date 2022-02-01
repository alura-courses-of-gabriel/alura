package com.company;

/**
 * @author Gabriel Santana de Menezes
 * @version 1.0
 */
public class Cliente implements Autenticavel{
    String nome;
    String cpf;
    String profissao;
    private AutenticacaoUtils autenticacaoUtils;

    public Cliente() {
        this.autenticacaoUtils = new AutenticacaoUtils();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
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
