package JAVA.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio05MayorPresupuesto {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        /*variables */
       int edad;
       float ingresosMensuales;

       /*pedimos los datos al usuario */
       System.out.print("Ingrese su edad: ");
       edad = entrada.nextInt();
       System.out.print("Ingrese sus ingresos mensuales: ");
       ingresosMensuales = entrada.nextFloat();

       /*suo de operadores logicos */
       if (edad >= 16 && ingresosMensuales >= 1000) {
        System.out.println("Debe tributar...");
    } else {
        System.out.println("No debe tributar...");
       }
    }
}
