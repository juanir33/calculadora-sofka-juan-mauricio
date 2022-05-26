package com.sofka;

import operaciones.Resta;
import operaciones.Suma;
import operaciones.Multiplicacion;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import operaciones.Division;

public class App {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        Logger log = Logger.getLogger("imprimir");
        log.info("\nBienvenido a la calculadora de Sofka");

        int respuesta = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            log.info("Seleccione la operación que desea hacer: ");
            log.info("\n1. suma\n2. Resta\n3. Multiplicación\n4. División\n0. salir");
            respuesta = Integer.valueOf(scanner.nextLine());

            log.info("Ingrese el primer número: ");
            double primerNumero = Double.valueOf(scanner.nextLine());

            log.info("Ingrese el segundo número: ");
            double segundoNumero = Double.valueOf(scanner.nextLine());

            String resultado;
            String confirmacion;

            switch (respuesta) {

                case 1:

                    Suma suma = new Suma(primerNumero, segundoNumero);
                    resultado = String.valueOf(suma.suma());
                    log.log(Level.INFO, "El resultado es {0}", resultado);

                    log.info("¿Desea continuar? (y/n)");
                    confirmacion = scanner.nextLine();

                    if (!confirmacion.equals("y")) {
                        respuesta = 0;
                    }

                    break;

                case 2:

                    Resta resta = new Resta(primerNumero, segundoNumero);
                    resultado = String.valueOf(resta.resta());
                    log.log(Level.INFO, "El resultado es {0}", resultado);

                    log.info("¿Desea continuar? (y/n)");
                    confirmacion = scanner.nextLine();

                    if (!confirmacion.equals("y")) {
                        respuesta = 0;
                    }

                    break;

                case 3:

                    Multiplicacion multiplicacion = new Multiplicacion(primerNumero, segundoNumero);
                    resultado = String.valueOf(multiplicacion.multiplicar());
                    log.log(Level.INFO, "El resultado es {0}", resultado);

                    log.info("¿Desea continuar? (y/n)");
                    confirmacion = scanner.nextLine();

                    if (!confirmacion.equals("y")) {
                        respuesta = 0;
                    }

                    break;

                case 4:

                    Division division = new Division(primerNumero, segundoNumero);
                    resultado = division.dividir();
                    log.log(Level.INFO, "El resultado es {0}", resultado);

                    log.info("¿Desea continuar? (y/n)");
                    confirmacion = scanner.nextLine();

                    if (!confirmacion.equals("y")) {
                        respuesta = 0;
                    }

                    break;

            }

            log.info("\n\nGracias por usar esta fabulosa calculadora!\n");

        } while (respuesta != 0);

    }

}
