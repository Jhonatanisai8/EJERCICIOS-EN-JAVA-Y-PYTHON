package JAVA.EJERCICIOS.BUCLES;
/*Crea un programa que simule un juego 
de adivinar un número.
El programa genera un número aleatorio
y el usuario debe adivinarlo. 
El programa le indicará si el 
número ingresado es mayor o menor 
que el número secreto.*/

import java.util.Random ;
import java.util.Scanner;

public class JuegoAdivinanza {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int numeroGenerado = random.nextInt(100) + 1;
        int numeroIngresado;
        boolean bandera = true;
        while (bandera) {
            System.out.print("Ingrese un numero : ");
            numeroIngresado = leer.nextInt();
            if (numeroIngresado < numeroGenerado) {
                System.out.println("El numero debe ser mayor. ");
            } else if (numeroIngresado > numeroGenerado) {
                System.out.println("El numero debe ser menor. ");
            } else {
                System.out.println("Felicidades adivinaste el numero. ");
                bandera = false;
            }
        }
    }
}
