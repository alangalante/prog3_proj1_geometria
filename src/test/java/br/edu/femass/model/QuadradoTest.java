package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void testArea() {
        Quadrado quadrado = new Quadrado(
                new SegmentoReta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                )
        );

        Double esperado = 25.0;
        Assertions.assertEquals(esperado, quadrado.getArea());
    }

    @Test
    void testPerimetro() {
        Quadrado quadrado = new Quadrado(
                new SegmentoReta(
                        0.0,
                        5.0,
                        5.0,
                        5.0
                )
        );

        Double esperado = 20.0;
        Assertions.assertEquals(esperado, quadrado.getPerimetro());
    }
}