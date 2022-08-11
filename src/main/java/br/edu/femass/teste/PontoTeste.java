package br.edu.femass.teste;

import br.edu.femass.model.Ponto;

public class PontoTeste {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1.2, 2.3);
        Ponto p2 = new Ponto(1.2, 2.3);


        if (p1.equals(p2)) {
            System.out.println("P1 é igual a P2");
        } else {
            System.out.println( "P1 é diferente de P2");
        }

    }
}
