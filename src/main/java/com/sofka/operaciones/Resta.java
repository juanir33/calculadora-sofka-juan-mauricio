package com.sofka.operaciones;

/**
 * Esta clase realiza la resta de dos números, siendo el primer número recibido menos el segundo número recibido
 * @author Juan Ramallo y Mauricio Gómez
 * @version 1.0.0
 */
public class Resta {
    private double minuendo;
    private double sustraendo;

    /**
     * Constructor para inicializar la operación de resta
     * @param minuendo numero al cual se le va a sustrae el valor del sustraendo
     * @param sustraendo el numero que se restará
     */
    public Resta(double minuendo, double sustraendo) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
    }

        /**
     * Método que devuelve el valor del minuendo
     * @return valor almacenado del minuendo
     */
    public double getMinuendo() {
        return minuendo;
    }

        /**
     * Método que devuelve el valor del sustraendo
     * @return valor almacenado del sustraendo
     */
    public double getSustraendo() {
        return sustraendo;
    }

    /**
     * Metodo que recibe el valor del minuendo
     * @param minuendo el numero que se restará
     */
    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;
    }

    /**
     * Metodo que recibe el valor del sustraendo
     * @param sustraendo el numero que se restará
     */
    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }

    /**
     * Método que realiza la resta
     * @return el resultado de la resta en formato double
     */
    public double resta() {
        return minuendo - sustraendo;
    }
}
