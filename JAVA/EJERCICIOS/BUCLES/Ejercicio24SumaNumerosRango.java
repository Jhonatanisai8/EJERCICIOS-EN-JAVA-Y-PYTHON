package JAVA.EJERCICIOS.BUCLES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION: 
Escribe un programa que sume todos los numeros
que hay en un determinado rango.
El programa pregunta al usuario el inicio 
y fin.
 */

import java.util.Scanner;
public class Ejercicio24SumaNumerosRango {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int inicio, fin, suma = 0;
        // pedimos los datos
        System.out.print("Por favor ingrese el número inicial: ");
        inicio = entrada.nextInt();
        System.out.print("Por favor ingrese el número final: ");
        fin = entrada.nextInt();
        // procedemos a sumar los numeros recorriendo todos
        // los numeros que hay en ese rango
        for (int i = inicio; i <= fin; i++) {
            // por cada interacion incrementamos la suma
            suma += i;
        }
        // mostramos la suma final
        System.out.println("La suma de los numeros en el rango " +
                "\n de " + inicio + " y " + fin + " es: " + suma);
        entrada.close();
    }
}
