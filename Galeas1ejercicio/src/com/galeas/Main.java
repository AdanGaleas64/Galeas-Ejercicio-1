package com.galeas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner lector = new Scanner(System.in);
            System.out.println("*** MENU ***");
            System.out.println("1. Elevar un numero");
            System.out.println("2. Calcular raiz cuadrada");
            System.out.println("3. Verificar si el numero ingresado es primo");

            int opcion = LectorDatos.solicitarEntero("Ingrese la opcion: ");

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero que desea elevar: ");
                    double nprimero = lector.nextDouble();
                    System.out.println("El resultado es:" + Matematicas.elevado(nprimero));
                    break;

                case 2:
                    System.out.println("Ingrese el numero que quiere sacara su raiz cuadrada: ");
                    double numero = lector.nextDouble();
                    System.out.println("El resultado es:" + Matematicas.raiz_cuadrada(numero));
                    break;

                case 3:
                    System.out.println("Ingrese el numero que quiere comprobar si es primo: ");
                    double numero2 = lector.nextDouble();
                    System.out.println(Matematicas.primo(numero2));

            }
        }
    }
}
