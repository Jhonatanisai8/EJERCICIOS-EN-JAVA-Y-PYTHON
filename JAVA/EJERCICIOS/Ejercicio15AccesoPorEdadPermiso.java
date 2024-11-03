package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Escribe un programa que pida la edad del usuario
y si tiene permiso de los padres (sí o no). 
Si la edad es mayor de 18, puede acceder; 
si es entre 16 y 18, solo puede acceder 
si tiene permiso de los padres; 
si es menor de 16, no puede acceder.
*/
import java.util.Scanner;
public class Ejercicio15AccesoPorEdadPermiso {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int edad;
        String permisoPadres;
        // pedimos los datos al usuario
        System.out.print("Ingresa tu edad: ");
        edad = leer.nextInt();
        System.out.print("¿Tienes permiso de tus padres(SI/NO)?: ");    
        permisoPadres = leer.next();
        // evaluamos dadas las condiciones
        if (edad >= 18) { // primera condicion
            System.out.println("Acceso Permitido.");
        }
        // segunda condicion
        else if (edad > 16 && edad < 18 && permisoPadres.equalsIgnoreCase("si")) {
            System.out.println("Acceso Permitido.");
        } else { // tercera condicion
            System.out.println("Acceso Denegado.");
        }
    }
}
