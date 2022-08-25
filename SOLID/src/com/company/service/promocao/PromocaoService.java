package com.company.service.promocao;

import com.company.ValidacaoException;
import com.company.model.Cargo;
import com.company.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, Boolean concluiuMeta) {
        Cargo cargoAtual = funcionario.getCargo();

        if (Cargo.GERENTE == cargoAtual) throw new ValidacaoException("Gerente não pode ser promovido");

        if (concluiuMeta){
            funcionario.promover(cargoAtual.proximoCargo());
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }

}
