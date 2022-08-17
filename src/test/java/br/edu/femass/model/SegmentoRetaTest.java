package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SegmentoRetaTest {

    @Test
    void testTamanho() {
        SegmentoReta segmentoReta = new SegmentoReta(0.0,0.0,0.0,5.0);
        Double esperado = 5.0;
        Assertions.assertEquals(esperado, segmentoReta.getTamanho());


    }

    @Test
    void testEquals() {
        SegmentoReta segmentoReta1 = new SegmentoReta(0.0,0.0,0.0,5.0);
        SegmentoReta segmentoReta2 = new SegmentoReta(0.0,0.0,0.0,5.0);
        Assertions.assertTrue(segmentoReta1.equals(segmentoReta2));
    }
}
