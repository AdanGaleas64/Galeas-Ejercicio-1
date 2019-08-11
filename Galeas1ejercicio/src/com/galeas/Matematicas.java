package com.galeas;
import java.lang.Math;


public class Matematicas {

    public static double elevado(double nprimero) {
        double resultado;

        resultado = nprimero * nprimero;
        return resultado;

    }

    public static double raiz_cuadrada(double numero) {
        double resultado2;

        resultado2 = Math.sqrt(numero);
        return resultado2;
    }

    public static double primo(double numero2) {
        int contador = 0;
        double I;

        for (I = 1; I <= numero2; I++) {
            if ((numero2 % I) == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println(numero2 + "\tEs primo");
        } else {
            System.out.println(numero2 + "\tNO es primo");
        }
        return numero2;

    }
}
