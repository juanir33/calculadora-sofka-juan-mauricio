package com.sofka.operaciones;


/**
 * Esta clase realiza la suma de dos números recibidos
 * @author Juan Ramallo y Mauricio Gómez
 * @version 1.0.0
 */
public class Suma {
    private double sumandoUno;
    private double sumandoDos;

    /**
     * Constructor para inicializar la operación suma
     * @param sumandoUno primer número a sumar
     * @param sumandoDos segundo número a sumar
     */
    public Suma(double sumandoUno, double sumandoDos) {
        this.sumandoUno = sumandoUno;
        this.sumandoDos = sumandoDos;
    }

    /**
     * Método que devuelve el valor del primer sumando
     * @return valor almacenado del primer sumando
     */
    public double getSumandoUno() {
        return sumandoUno;
    }

        /**
     * Método que devuelve el valor del segundo sumando
     * @return valor almacenado del segundo sumando
     */
    public double getSumandoDos() {
        return sumandoDos;
    }

    /**
     * Metodo que recibe el valor del primer sumando
     * @param sumandoUno primer número a sumar
     */
    public void setSumandoUno(double sumandoUno) {
        this.sumandoUno = sumandoUno;
    }

    /**
     * Metodo que recibe el valor del primer sumando
     * @param sumandoDos segundo número a sumar
     */
    public void setSumandoDos(double sumandoDos) {
        this.sumandoDos = sumandoDos;
    }

    /**
     * Método que realiza la suma
     * @return el resultado de la suma en formato double
     */
    public double suma() {
        return sumandoUno + sumandoDos;
    }

}
