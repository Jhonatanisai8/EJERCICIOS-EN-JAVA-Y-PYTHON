package JAVA.EJERCICIOS;
/*
EJERCICIO DE PROGRAMACION:
Los tramos impositivos para la declaración de la renta 
en un determinado país son los siguientes:

Renta	                | Tipo impositivo
Menos de 10000€	        => 5%
Entre 10000€ y 20000€	=> 15%
Entre 20000€ y 35000€	=> 20%
Entre 35000€ y 60000€	=> 30%
Más de 60000€	        =>   45%
Escribir un programa que pregunte al usuario su renta 
anual y muestre por pantalla el tipo impositivo 
que le corresponde.
 */
import java.util.Scanner;

public class Ejercicio07TributarRenta {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        double montoRenta = 0;

        // pedimos el dato al usuario
        System.out.println("Ingrese el monto de la renta anual: ");
        montoRenta = e.nextDouble();
        // SEGUN EL MONTO DE LA RENTA LE MOSTRAMOS EL TIPO DE IMPOSITIVO
        if (montoRenta < 10000) {
            System.out.println("Le corresponde pagar el 5% de impositivo.");
        } else if (montoRenta >= 10000 && montoRenta <= 20000) {
            System.out.println("Le corresponde pagar el 15% de impositivo.");
        } else if (montoRenta >= 20001 && montoRenta <= 35000) {
            System.out.println("Le corresponde pagar el 20% de impositivo.");
        } else if (montoRenta >= 35001 && montoRenta <= 60000) {
            System.out.println("Le corresponde pagar el 30% de impositivo.");
        } else {
            System.out.println("Le corresponde pagar el 45% de impositivo.");
        }

    }
}
