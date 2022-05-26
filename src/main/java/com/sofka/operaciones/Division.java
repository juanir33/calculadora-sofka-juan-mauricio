package com.sofka.operaciones;

/**
 * Esta clase realiza la division de dos números recibidos, siendo el primer numero recibido menos el segundo 
 * @author Juan Ramallo y Mauricio Gómez
 * @version 1.0.0
 */
public class Division {

    private double dividendo;
    private double divisor;

    /**
     * Constructor para inicializar la operación dividir
     * @param dividendo número a dividir o repartir
     * @param divisor número por el cual se dividirá el dividendo
     */
    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    /**
     * Método que devuelve el valor del dividendo
     * @return valor almacenado del dividendo
     */
    public double getDividendo() {
        return dividendo;
    }

    /**
     * Metodo que recibe el valor del dividendo
     * @param dividendo número a dividir o repartir
     */
    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    /**
     * Método que devuelve el valor del divisor
     * @return valor almacenado del divisor
     */
    public double getDivisor() {
        return divisor;
    }

    /**
     * Metodo que recibe el valor del divisor 
     * @param divisor número por el cual se dividirá el dividendo
     */
    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    /**
     * Método que realiza la división
     * @return el resultado de la división en formato String
     */
    public String dividir() {
        if (divisor == 0) {
            return "Syntax Error \nNo se puede dividir por cero\n";
        }
        return String.valueOf(dividendo / divisor);
    }

}
