package JAVA.EJERCICIOS.CONDICIONALES;


/*
EJERCICIO DE PROGRAMACION:
Los alumnos de un curso se han dividido en dos grupos A y B
de acuerdo al sexo y el nombre. El grupo A esta formado por
las mujeres con un nombre anterior a la M y los hombres con
un nombre posterior a la N y el grupo B por el resto. 
Escribir un programa que pregunte al usuario su nombre 
y sexo, y muestre por pantalla el grupo que le corresponde.
*/
import java.util.Scanner;
public class Ejercicio06GrupoHombreMujer {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        final char limiteLetraMujer = 'M';
        final char limiteLetraHombre = 'N';
        String nombre;
        char genero;

        // pedimos los datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su genero (M = Masculino) " +
                " (F = Femenino): ");
        genero = entrada.nextLine().charAt(0);

        // comparamos los caracteres y mostramos a que grupo pertenecen
        if (nombre.charAt(0) <= limiteLetraMujer && genero == 'F') {
            System.out.println("Perteneces al grupo A");
        } else if (nombre.charAt(0) >= limiteLetraHombre && genero == 'M') {
            System.out.println("Perteneces al grupo A");
        } else {
            System.out.println("Perteneces al grupo B");
        }
    }
}
