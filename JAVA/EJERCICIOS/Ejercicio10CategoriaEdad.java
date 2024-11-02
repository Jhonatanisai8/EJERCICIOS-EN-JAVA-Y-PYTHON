package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Pide al usuario que ingrese su edad 
y determina si es un niño (0-12), 
adolescente (13-17), adulto (18-64) 
o adulto mayor (65+).
 */
import java.util.Scanner;
public class Ejercicio10CategoriaEdad {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        // variable
        int edad;
        // solicitamos la edad
        System.out.println("Ingrese su edad por favor: ");
        edad = entrada.nextInt();
        // segun la edad le mostramos a que categoria pertenece
        if (edad > 0 && edad <= 12) {
            System.out.println("Esta es la categoria niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Esta en la categoria de adolecente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Esta en la categoria de adulto.");
        } else if (edad >= 65) {
            System.out.println("Esta en la categoria de adulto mayor");
        } else {
            System.out.println("Edad invalida. Por favor Ingresar de nuevo.");
        }

    }
}
