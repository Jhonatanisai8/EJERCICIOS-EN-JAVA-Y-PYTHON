package JAVA.EJERCICIOS.CONDICIONALES;

import java.util.Scanner;
public class Ejercicio03DivisorCero {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        /*variables */
        int numero, divisor;
        /*pedimos al usuario los datos */
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        System.out.print("Ingrese el numero divisor: ");
        divisor = leer.nextInt();

        /*validamos mediante condicionales */
        if (divisor == 0) {
            System.out.println("ERROR!!!, no se puede dividir por cero...");
        } else {
            int division;
            division = numero / divisor;
            System.out.println("la division es: " + division);
        }
    }
}
