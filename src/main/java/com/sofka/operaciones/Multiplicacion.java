package com.sofka.operaciones;

public class Multiplicacion {
    private double multiplicando;
    private double multiplicador;

    public Multiplicacion(double multiplicando, double multiplicador) {
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
    }

    public double getMultiplicando() {
        return multiplicando;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    public double multiplicar(){return multiplicando*multiplicador;}
}
