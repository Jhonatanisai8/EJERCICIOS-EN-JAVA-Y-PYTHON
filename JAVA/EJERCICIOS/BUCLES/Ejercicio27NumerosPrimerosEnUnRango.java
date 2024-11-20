package JAVA.EJERCICIOS.BUCLES;

import java.util.Scanner;

/*
Pide al usuario dos numeros y verifica 
cúales de los numeros en ese rango son 
primos.
 */
public class Ejercicio27NumerosPrimerosEnUnRango {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int nInicio, nFinal;
        System.out.println("Ingresa el numero incial: ");
        nInicio = leer.nextInt();
        System.out.println("Ingresa el numero final: ");
        nFinal = leer.nextInt();

        System.out.println("Numeros primos en ese rango: ");
        for (int i = nInicio; i <= nFinal; i++) {
            if (esPrimo(i)) {
                System.out.println("N: " + i);
            }
        }

    }

    static boolean esPrimo(int numero) {
        int contadorDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }
        return contadorDivisores <= 2;
    }
}
