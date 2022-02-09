package com.company.model;

import com.company.ValidacaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void atualizarSalario(BigDecimal aumento) {
        this.salario = this.salario.add(aumento);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }
}
