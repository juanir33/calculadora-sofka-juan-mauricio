package com.sofka.operaciones;

/**
 * Esta clase realiza la multiplicación de dos números recibidos
 * @author Juan Ramallo y Mauricio Gómez
 * @version 1.0.0
 */
public class Multiplicacion {
    private double multiplicando;
    private double multiplicador;

    /**
     * Constructor para inicializar la operación multiplicación
     * @param multiplicando número que se está multiplicando
     * @param multiplicador número por el que se está multiplicando
     */
    public Multiplicacion(double multiplicando, double multiplicador) {
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
    }

    /**
     * Método que devuelve el valor del multiplicando
     * @return valor almacenado del multiplicando
     */
    public double getMultiplicando() {
        return multiplicando;
    }

    /**
     * Método que devuelve el valor del multiplicador
     * @return valor almacenado del multiplicador
     */
    public double getMultiplicador() {
        return multiplicador;
    }

    /**
     * Metodo que recibe el valor del multiplicador
     * @param multiplicador número que se está multiplicando
     */
    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    /**
     * Metodo que recibe el valor del multiplicando
     * @param multiplicando número por el que se está multiplicando
     */
    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    /**
     * Método que realiza la multiplicación
     * @return el resultado de la multiplicación en formato double
     */
    public double multiplicar() {
        return multiplicando * multiplicador;
    }

}
