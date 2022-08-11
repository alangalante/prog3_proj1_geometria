package br.edu.femass.teste;

import br.edu.femass.model.Ponto;
import br.edu.femass.model.SegmentoReta;

public class SegmentoRetaTest {

    public static void main(String[] args) {
        SegmentoReta r1 = new SegmentoReta(
                0.0,
                0.0,
                1.0,
                2.0);


        SegmentoReta r2 = new SegmentoReta(
                new Ponto(1.0, 2.0),
                new Ponto()
        );

        System.out.println(r1.equals(r2));

    }
}
