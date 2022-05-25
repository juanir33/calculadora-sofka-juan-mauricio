package com.sofka;
import operaciones.Resta;
import operaciones.Suma;
import operaciones.Multiplicacion;
public class App{
    public static void main(String[]args){

        Suma suma = new Suma(2, 3);
        System.out.println(suma.suma());

        Resta resta = new Resta(3,2);
        System.out.println(resta.resta());

        Multiplicacion multiplicacion  = new Multiplicacion(5, 7);
        System.out.println(multiplicacion.multiplicar());

    }

}
