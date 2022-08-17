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
        Ponto p = new Ponto(1.0, 1.0);
        String esperado = "1o Quadrante";
        Assertions.assertEquals(esperado, p.getLocalizacao());

    }
    @Test
    void testSegundoQuadrante() {
        Ponto p = new Ponto(-1.0, 1.0);
        String esperado = "2o Quadrante";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testTerceiroQuadrante() {
        Ponto p = new Ponto(-1.0, -1.0);
        String esperado = "3o Quadrante";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testQuartoQuadrante() {
        Ponto p = new Ponto(1.0, -1.0);
        String esperado = "4o Quadrante";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testEixoX() {
        Ponto p = new Ponto(1.0, 0.0);
        String esperado = "Eixo de X";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testEixoY() {
        Ponto p = new Ponto(0.0, 1.0);
        String esperado = "Eixo de Y";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testOrigem() {
        Ponto p = new Ponto();
        String esperado = "Origem";
        Assertions.assertEquals(esperado, p.getLocalizacao());
    }
    @Test
    void testDistanciaDoisPontos() {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(0.0, 5.0);
        Double esperado = 5.0;
        Assertions.assertEquals(esperado, p1.getDistancia(p2));
    }

    @Test
    void testEquals() {
        Ponto p1 = new Ponto(1.0, 1.0);
        Ponto p2 = new Ponto(1.0, 1.0);
        Assertions.assertTrue(p1.equals(p2));
    }


}
