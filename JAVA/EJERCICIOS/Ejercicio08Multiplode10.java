package JAVA.EJERCICIOS;
/*
 Programa que lea un número entero
  y muestre si el número es múltiplo de 10.
 */
import java.util.Scanner;

public class Ejercicio08Multiplode10 {

    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        // variable
        int numero;

        // pedimos el dato al usuario
        System.out.print("ingrese el numero por favor: ");
        numero = e.nextInt();

        // evaluamos el numero
        if (numero % 10 == 0) {
            System.out.println("El numero "+numero+" es multiplo de 10.");
        } else {
            System.out.println("El numero "+numero+" no es multiplo de 10.");
        }
    }
}