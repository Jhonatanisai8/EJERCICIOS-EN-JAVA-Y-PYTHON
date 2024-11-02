package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Realiza un programa que reciba un año e 
indique si es un año bisiesto o no 
(un año es bisiesto si es divisible por 4,
pero no por 100, a menos que sea divisible 
por 400).
 */
import java.util.Scanner;

public class Ejercicio11AnioBisiesto {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // variable
        int anio;
        // pedimos el año
        System.out.print("Ingresa el año por favor: ");
        anio = entrada.nextInt();
        // mediante condicionales evaluamos
        if ((anio % 4 == 0) && !(anio % 100 == 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
