package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void testArea() {
        Retangulo retangulo = new Retangulo(
          new SegmentoReta(
                  0.0,
                  0.0,
                  0.0,
                  5.0
          ),
          new SegmentoReta(
                  0.0,
                  0.0,
                  8.0,
                  0.0
          )
        );
        Double esperado = 40.0;
        Assertions.assertEquals(esperado, retangulo.getArea());

    }

    @Test
    void testPerimetro() {
        Retangulo retangulo = new Retangulo(
                new SegmentoReta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                ),
                new SegmentoReta(
                        0.0,
                        0.0,
                        8.0,
                        0.0
                )
        );
        Double esperado = 26.0;
        Assertions.assertEquals(esperado, retangulo.getPerimetro());
    }
}