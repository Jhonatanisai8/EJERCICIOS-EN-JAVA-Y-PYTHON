package JAVA.EJERCICIOS.CONDICIONALES;

/*
EJERCICIO DE PROGRAMACIÓN:
Escribir un programa que almacene la cadena 
de caracteres contraseña en una variable, 
pregunte al usuario por la contraseña e 
imprima por pantalla si la contraseña 
introducida por el usuario coincide con 
la guardada en la variable sin tener en 
cuenta mayúsculas y minúsculas.
 */
import java.util.Scanner;

public class Ejercicio02CompararContrasenia {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        /* variables */
        final String contraseniaGuardada = "admin123";
        String contraseniaIngresada;
        /* pedimos la contraseña al usuario */
        System.out.println("Ingrese la contraseña por favor: ");
        contraseniaIngresada = entrada.nextLine();
        /* comparamos */
        if (contraseniaGuardada.equalsIgnoreCase(contraseniaIngresada)) {
            System.out.println("La contraseña ingresada coincide con al contraseña guardada");
        } else {
            System.out.println("La contraseña ingresada no coincide con al contraseña guardada");
        }
    }

}