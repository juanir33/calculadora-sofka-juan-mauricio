package com.sofka;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sofka.operaciones.Suma;
import com.sofka.operaciones.Resta;
import com.sofka.operaciones.Multiplicacion;
import com.sofka.operaciones.Division;

public class App {

    public static void main(String[] args) {

        menu();

    }

    private static final String MGSRESULTADO = "El resultado es {0}";
    private static final String MGSCONTINUAR = "¿Desea continuar? (y/n)";

    public static void menu() {

        Logger log = Logger.getLogger("imprimir");
        log.info("\nBienvenido a la calculadora de Sofka");

        int respuesta;
        do {
            Scanner scanner = new Scanner(System.in);

            log.info("Seleccione la operación que desea hacer: ");
            log.info("\n1. suma\n2. Resta\n3. Multiplicación\n4. División\n0. salir");
            respuesta = Integer.parseInt(scanner.nextLine());

            log.info("Ingrese el primer número: ");
            double primerNumero = Double.parseDouble(scanner.nextLine());

            log.info("Ingrese el segundo número: ");
            double segundoNumero = Double.parseDouble(scanner.nextLine());

            String resultado;
            String confirmacion;

            switch (respuesta) {
                case 1 -> {
                    Suma suma = new Suma(primerNumero, segundoNumero);
                    resultado = String.valueOf(suma.suma());
                    log.log(Level.INFO, MGSRESULTADO, resultado);
                }
                case 2 -> {
                    Resta resta = new Resta(primerNumero, segundoNumero);
                    resultado = String.valueOf(resta.resta());
                    log.log(Level.INFO, MGSRESULTADO, resultado);
                }
                case 3 -> {
                    Multiplicacion multiplicacion = new Multiplicacion(primerNumero, segundoNumero);
                    resultado = String.valueOf(multiplicacion.multiplicar());
                    log.log(Level.INFO, MGSRESULTADO, resultado);
                }
                case 4 -> {
                    Division division = new Division(primerNumero, segundoNumero);
                    resultado = division.dividir();
                    log.log(Level.INFO, MGSRESULTADO, resultado);
                }
                default -> log.info("Ingrese una opcion");
            }
            
            log.info(MGSCONTINUAR);
            confirmacion = scanner.nextLine();
            if (!confirmacion.equals("y")) {
                respuesta = 0;
                log.info("\n\nGracias por usar esta fabulosa calculadora!\n");
            }

        } while (respuesta != 0);

    }

}
