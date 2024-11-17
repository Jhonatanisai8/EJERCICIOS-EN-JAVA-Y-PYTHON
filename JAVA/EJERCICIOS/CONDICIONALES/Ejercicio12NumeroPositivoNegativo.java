package JAVA.EJERCICIOS.CONDICIONALES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Pide al usuario un número e
imprime si es positivo, negativo
o cero.
 */

import java.util.Scanner;
public class Ejercicio12NumeroPositivoNegativo {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // variable
        int numero;
        // pedimos el numero al usuario
        System.out.print("Ingresa un numero: ");
        numero = leer.nextInt();
        // evaluamos segun las condiciones dadas
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}
