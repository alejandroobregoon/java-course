package com.alejandro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese Operacion del 1 al 5");
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");
        System.out.println("5.- RESTO");
        System.out.println("0.- SALIR");
        System.out.println("ELIGA OPCION: ");
        Integer opcion = escaner.nextInt();
        System.out.println("Ingrese el primer digito: ");
        double pr = escaner.nextDouble();
        System.out.println("Ingrese el segundo digito: ");
        double se = escaner.nextDouble();

        switch (opcion) {
            case 1:
                double suma = pr + se;
                System.out.println("La Suma es: " + suma);
                break;
            case 2:
                double resta = pr - se;
                System.out.println("La Resta es: " + resta);
                break;
            case 3:
                double multi = pr * se;
                System.out.println("La Multiplicación es: " + multi);
                break;
            case 4:
                double divi = pr / se;
                System.out.println("La División es: " + divi);
                break;
            case 5:
                double modu = pr % se;
                System.out.println("El Resto es: " + modu);
                break;
            default:
                System.out.println("No existe tal opción");
        }
    }
}