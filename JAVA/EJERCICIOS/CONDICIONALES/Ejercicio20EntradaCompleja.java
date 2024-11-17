package JAVA.EJERCICIOS.CONDICIONALES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION: 
crear un programa que funcione como una calculadora
básica interactiva, permitiendo al usuario seleccionar
entre sumar, restar, multiplicar o dividir dos números
ingresados, y mostrando el resultado o mensajes 
de error en caso de entradas inválidas o divisiones por cero.
 */
import java.util.Scanner;
public class Ejercicio20EntradaCompleja {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int opcion, n1, n2;
        // pedimos los datos
        System.out.print("Ingresa una opcion: " +
                "\n1. Sumar" +
                "\n2. Dividir" +
                "\n3. Multiplicar" +
                "\n4. Restar: ");
        opcion = leer.nextInt();
        System.out.print("Ingresa el primer numero: ");
        n1 = leer.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        n2 = leer.nextInt();
        // evaluamos
        switch (opcion) {
            case 1:
                System.out.println("RESULTADO: " + (n1 + n2));
                break;
            case 2:
                // validamos la division
                if (n2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("RESULTADO: " + (n1 / n2));
                }
                break;
            case 3:
                System.out.println("RESULTADO: " + (n1 * n2));
                break;
            case 4:
                System.out.println("RESULTADO: " + (n1 - n2));
                break;
            default:
                System.out.println("Ingrese una opcion valida!.");
                break;
        }
    }
}
