package com.company;

/**
 * Responsável por generalidades entre os tipos de conta
 * @author Gabriel Santana de Menezes
 * @version 1.0
 */
public abstract class Conta {
    private double saldo;
    @Positivo
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }


    /**
     * Responsável por sacar dinheiro da conta
     * @param valor
     * É o valor a ser sacado da conta
     * @throws SaldoInsuficienteException
     * Exceção lançada quando o saldo da conta for menor que o valor a ser sacado
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo de " + this.saldo + " é insuficiente para realizar o saque de " + valor);
        }
        this.saldo -= valor;
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular.getNome() +
                '}';
    }
}