package br.edu.femass.model;

public class Quadrado {
    protected SegmentoReta lado;

    public Quadrado(SegmentoReta lado) {
        this.lado = lado;
    }

    public SegmentoReta getLado() {
        return lado;
    }

    public Double getArea() {
        return Math.pow(this.lado.getTamanho(),2);
    }

    public Double getPerimetro() {
        return this.lado.getTamanho()*4;
    }

}
