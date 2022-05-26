package com.sofka.operaciones;

public class Division {

    private double dividendo;
    private double divisor;

    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public String dividir() {
        if (divisor == 0) {
            return "Syntax Error \nNo se puede dividir por cero\n";
        }
        return String.valueOf(dividendo / divisor);
    }
    public int continuar(String confirm, int respue){


        if (!confirm.equals("y")) {
            respue = 0;
        }

        return respue;
    }

}
