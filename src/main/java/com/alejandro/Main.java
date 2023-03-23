package com.alejandro;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final int OPCION_SUMA = 1, OPCION_RESTA = 2, OPCION_MULTIPLICACION = 3, OPCION_DIVISION = 4, OPCION_MODULACION = 5;

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("* BIENVENIDOS A LA CALCULADORA *");
        System.out.println("********************************");
        System.out.println("* INGRESE DIGITOS DEL 1 AL 5   *");
        System.out.println("*------------------------------*");
        System.out.println("* 1.- SUMA                     *");
        System.out.println("* 2.- RESTA                    *");
        System.out.println("* 3.- MULTIPLICACION           *");
        System.out.println("* 4.- DIVISION                 *");
        System.out.println("* 5.- RESTO                    *");
        System.out.println("* 0.- SALIR                    *");
        System.out.println("********************************");
        System.out.print("* ELIGA OPCION: ");
        Integer opcion = escaner.nextInt();
        System.out.println("********************************");

        System.out.println("------------------------------");
        System.out.print("| Ingrese el primer digito: ");
        double primerDigito = escaner.nextDouble();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.print("| Ingrese el segundo digito: ");
        double segundoDigito = escaner.nextDouble();
        System.out.println("------------------------------");

        double suma = primerDigito + segundoDigito, resta = primerDigito - segundoDigito, multi = primerDigito * segundoDigito, divi = primerDigito / segundoDigito, modu = primerDigito % segundoDigito;

        HashMap<Integer, Double> operaciones = new HashMap<Integer, Double>();
        operaciones.put(OPCION_SUMA, suma);
        operaciones.put(OPCION_RESTA, resta);
        operaciones.put(OPCION_MULTIPLICACION, multi);
        operaciones.put(OPCION_DIVISION, divi);
        operaciones.put(OPCION_MODULACION, modu);

        for (Integer i : operaciones.keySet()) {
            if (operaciones.containsKey(opcion)) {
                System.out.println("El Resultado de la operacion es: " + operaciones.get(opcion));
                break;
            }
        }
    }
}