package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PontoTest {

    @Test
    void testConstrutorVazio() {
        Ponto p = new Ponto();
        String esperado = "(0.0, 0.0)";
        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testConstrutorComParametros() {
        Ponto p = new Ponto(1.2, 3.5);
        String esperado = "(1.2, 3.5)";
        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testPrimeiroQuadrante() {

    }
    @Test
    void testSegundoQuadrante() {

    }
    @Test
    void testTerceiroQuadrante() {

    }
    @Test
    void testQuartoQuadrante() {

    }
    @Test
    void testEixoX() {

    }
    @Test
    void testEixoY() {

    }
    @Test
    void testOrigem() {

    }
    @Test
    void testDistanciaDoisPontos() {

    }

    @Test
    void testEquals() {

    }


}
