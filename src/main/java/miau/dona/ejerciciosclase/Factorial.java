package miau.dona.ejerciciosclase;

import miau.dona.utils.UtilsJava;

public class Factorial {
    public static void main(String[] args) {
        // factorial();
    }
    public static void factorial() {
        int numFactorial = UtilsJava.pedirInt("Introduce un numero para caluclar su factorial");
        int resultado = 1;
        for (int i = numFactorial; i > 1; i--) {
            resultado = resultado * i;

            System.out.println(resultado);
        }
    }

    public static void primos() {
        int numeroPrimo = UtilsJava.pedirInt("Introduce numero calcular factorial");
        int contador = 0;
        boolean esPrimo = true;
        // de 0 a 10, cuantos primos quieres que haya
        while (contador < numeroPrimo) {
            esPrimo=true;
            for (int i = 2; i < numeroPrimo; i++) {
                if (numeroPrimo%i == 0) {
                    esPrimo = false;
                } else contador++;
            }
            System.out.println("");


        }

    }
}