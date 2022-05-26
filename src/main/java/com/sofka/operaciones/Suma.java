package com.sofka.operaciones;

public class Suma {
    private double sumandoUno;
    private double sumandoDos;

    public Suma(double sumandoUno, double sumandoDos) {
        this.sumandoUno = sumandoUno;
        this.sumandoDos = sumandoDos;
    }

    public double getSumandoUno() {
        return sumandoUno;
    }

    public double getSumandoDos() {
        return sumandoDos;
    }

    public void setSumandoUno(double sumandoUno) {
        this.sumandoUno = sumandoUno;
    }

    public void setSumandoDos(double sumandoDos) {
        this.sumandoDos = sumandoDos;
    }

    public double suma(){return sumandoUno+sumandoDos;}

}
