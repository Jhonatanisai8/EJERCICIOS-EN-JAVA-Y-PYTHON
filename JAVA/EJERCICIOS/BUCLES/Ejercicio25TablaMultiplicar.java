package JAVA.EJERCICIOS.BUCLES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que genere y muestre 
la tabla de multiplicar de un número 
introducido por el usuario (del 1 al 12).
 */
import java.util.Scanner;
public class Ejercicio25TablaMultiplicar {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int numero, resultado;
        // pedimos el numero
        System.out.print("Por favor ingresa un número: ");
        numero = entrada.nextInt();
        // procedemos a mostrar la tabla de multiplicar
        for (int i = 1; i <= 12; i++) {
            /* multiplicamos el numero ingresado 
            por cada iteracion (i).*/
            resultado = numero * i;
            System.out.println(numero+ " X " + i + " = " + resultado);
        }
    }
}
