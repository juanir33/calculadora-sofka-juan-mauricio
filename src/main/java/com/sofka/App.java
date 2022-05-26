package com.sofka;
import com.sofka.operaciones.Resta;
import com.sofka.operaciones.Suma;
import com.sofka.operaciones.Multiplicacion;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App{
    public static void main(String[]args){
        Logger log = Logger.getLogger("mylog");

// log a plain text method

        log.log(Level.WARNING,"I'm using JBoss Logging.");

        Suma suma = new Suma(2, 3);
        String response = String.valueOf(suma.suma());
        log.log(Level.INFO, response);

        Resta resta = new Resta(3,2);
        System.out.println(resta.resta());

        Multiplicacion multiplicacion  = new Multiplicacion(5, 7);
        System.out.println(multiplicacion.multiplicar());

    }

}
