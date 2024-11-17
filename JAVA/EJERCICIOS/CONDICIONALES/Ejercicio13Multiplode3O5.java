package JAVA.EJERCICIOS.CONDICIONALES;
/*
 Escribe un programa que lea un número e 
 imprima si es divisible por 3, por 5, 
 por ambos o por ninguno.
 */
import java.util.Scanner;
public class Ejercicio13Multiplode3O5 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variable
        int numero;
        // pedimos el numero
        System.out.print("Por favor ingresar el numero: ");
        numero = leer.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El numero es divisible por 3 y 5. ");
        } else if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es divisible por 3.");
        } else {
            System.out.println("El numero no es divisible poto3 y 5.");
        }
    }
}
