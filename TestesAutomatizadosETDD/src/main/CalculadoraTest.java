package main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculadoraTest {

    @Test
    public void deveSomarDoisNumerosPositivos(){
        Integer a = 1;
        Integer b = 2;
        Integer resultadoEsperado = 1 + 2;

        Integer resultadoObtido = Calculadora.somar(a, b);

        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
}