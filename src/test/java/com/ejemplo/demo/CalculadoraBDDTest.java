package com.ejemplo.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CalculadoraBDDTest {
    @Test
    void dadoDosNumeros_cuandoSumo_entoncesObtengoLaSuma() {
        //given
        Calculadora calc = new Calculadora();
        //when
        int resultado = calc.sumar(4, 6);
        //then
        assertThat(resultado).isEqualTo(10);
    }
}
