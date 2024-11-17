package JAVA.EJERCICIOS.CONDICIONALES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Escribe un programa que pida al usuario 
tres números distintos y determine cuál 
es el mayor y cuál es el menor. Además, 
si los tres números son mayores de 50, 
imprime "Todos los números son altos".
 */

import java.util.Scanner;
public class Ejercicio16Mayor3Numeros {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int n1, n2, n3;
        System.out.print("Ingrese un numero: ");
        n1 = e.nextInt();
        System.out.print("Ingrese un numero: ");
        n2 = e.nextInt();
        System.out.print("Ingrese un numero: ");
        n3 = e.nextInt();
        // si todos son mayores a 50
        if (n1 > 50 && n2 > 50 && n3 > 50) {
            System.out.println("Todos los numeros son altos.");
        }
        // si el primero el mayor
        else if (n1 > n2 && n1 > n3) {
            System.out.println("El numero mayor es: " + n1);
        }
        // si el segundo el mayor
        else if (n2 > n1 && n2 > n3) {
            System.out.println("El numero mayor es: " + n2);
        }
        // si el tercero el mayor
        else if (n3 > n1 && n3 > n2) {
            System.out.println("El numero mayor es: " + n3);
        }
    }
}
