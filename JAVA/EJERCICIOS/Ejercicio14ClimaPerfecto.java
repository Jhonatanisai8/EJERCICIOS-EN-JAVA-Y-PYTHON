package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Solicita la temperatura y si está lloviendo (sí o no).
Si la temperatura es entre 20 y 30 grados y no está 
lloviendo, muestra un mensaje de
"Clima perfecto para un paseo", de lo contrario
un mensaje de advertencia de "no salir de casa".
 */
import java.util.Scanner;
public class Ejercicio14ClimaPerfecto {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variable 
        int temperatura;
        String lluvia;
        // pedimos los datos
        System.out.print("Ingrese la temperatura: ");
        temperatura = leer.nextInt();
        System.out.print("¿Esta lloviendo (SI/NO) ?: ");
        lluvia = leer.next();
        if (temperatura >= 20 && temperatura <= 30 && !lluvia.equalsIgnoreCase("si")) {
            System.out.println("Clima perfecto para un paseo");
        } else{
            System.out.println("No debe salir de casa.");
        }

    }
}
