package JAVA.EJERCICIOS.BUCLES;

/*
Crea un programa que simule un juego de adivinar un número.
El programa genera un número aleatorio y el usuario debe
adivinarlo. El programa le indicará si el número 
ingresado es mayor o menor que el número secreto.
 */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio29JuegoAdivinanza {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Random numeroRandom = new Random();
        // numero generado
        final int numeroGenerado = numeroRandom.nextInt(100) + 1;
        int numeroIngresado;
        // variable auxiliar
        boolean bandera = true;
        while (bandera) {
            // pedimos el numero 
            System.out.println("Ingrese el numero: ");
            numeroIngresado = leer.nextInt();
            // indicamos si es menor o mayor 
            if (numeroIngresado < numeroGenerado) {
                System.out.println("El numero debe ser mayor");
            } else if (numeroIngresado > numeroGenerado) {
                System.out.println("El numero debe ser menor");
            } else {
                bandera = false;
                System.out.println("Adivino el numero, Felicidades!");
            }
        }

    }
}
