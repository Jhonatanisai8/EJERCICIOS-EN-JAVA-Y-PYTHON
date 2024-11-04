package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION;
Pide al usuario la hora de entrada y la hora de
ssalida de un estacionamiento. Si el tiempo de 
estancia es menor a 2 horas, la tarifa es gratis;
entre 2 y 5 horas, la tarifa es de $10 por hora; 
más de 5 horas, la tarifa es de $15 por hora.
Usa condicionales y operadores lógicos para calcular la tarifa total.
 */
import java.util.Scanner;
public class Ejercicio18TarifaEstacionamiento {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int horas;
        double montoTarifa = 0;
        // pedimos los datos
        System.out.print("INGRESA LAS HORAS: ");
        horas = leer.nextInt();
        // condicionales
        if (horas >= 2 && horas <= 5) {
            montoTarifa = horas * 10;
        } else if (horas > 5) {
            montoTarifa = horas * 15;
        }
        System.out.println("MONTO A PAGAR: " + montoTarifa);
    }
}
