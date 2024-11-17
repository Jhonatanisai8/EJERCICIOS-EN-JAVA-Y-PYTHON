package JAVA.EJERCICIOS.CONDICIONALES;

import java.util.Scanner;
public class Ejercicio01MayorOnoMenor {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /* variable */
        int edad;
        /* pedimos al usuario su edad */
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        /* verificamos mediante condicionales */
        if (edad >= 18) {
            System.out.println("Eres mayor de edad...");
        } else {
            System.out.println("Eres menor de edad...");
        }
    }
}