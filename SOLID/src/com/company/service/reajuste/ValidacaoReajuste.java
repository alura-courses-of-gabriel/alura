package com.company.service.reajuste;

import com.company.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void valida(Funcionario funcionario, BigDecimal aumento);
}
