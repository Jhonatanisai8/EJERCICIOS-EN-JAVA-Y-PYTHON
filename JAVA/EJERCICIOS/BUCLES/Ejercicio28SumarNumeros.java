package JAVA.EJERCICIOS.BUCLES;
/*
Escribe un programa que pida al usuario números 
hasta que ingrese el número 0. Al final, debe
imprimir la suma de todos los números ingresados.
 */

import java.util.Scanner;
public class Ejercicio28SumarNumeros {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int numero = 1, suma = 0;
        // mientras que el número sea distinto de 0
        while (numero != 0) {
            // pedimos el numero y incrementamos la suma con cada numero ingresado
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            suma += numero;
        }
        // mostramos la suma total
        System.out.println("Suma total: " + suma);
    }
}
