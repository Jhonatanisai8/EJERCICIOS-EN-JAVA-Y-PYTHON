package JAVA.EJERCICIOS.CONDICIONALES;

/*
EJERCICIO DE LOGICA DE PROGRAMACION:
 Escribe un programa que pida al usuario su edad, 
 salario mensual y número de años de antigüedad 
 en su empleo. Para ser elegible para un préstamo,
 debe cumplir con las siguientes condiciones:

- Tener entre 25 y 60 años.
- Tener un salario mensual mayor a $30,000.
- Tener al menos 2 años de antigüedad en su empleo.
Si cumple con estas condiciones, imprime "Préstamo aprobado".
Si no las cumple, indica específicamente cuál(es) 
de las condiciones no se cumplen (por ejemplo, 
"Edad fuera del rango" o "Antigüedad insuficiente").
 */
import java.util.Scanner;
public class Ejercicio17ElegibilidadDePrestamo {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        int edad, aniosAntiguedadEmpleo;
        double salarioMensual;
        // pedimos los datos
        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese su salario mensual: ");
        salarioMensual = leer.nextDouble();
        System.out.print("Ingrese su numeros de años de antiguedad de empleo: ");
        aniosAntiguedadEmpleo = leer.nextInt();
        // uso de condicionales segun el problema
        if (edad >= 25 && edad <= 60) {
            if (salarioMensual >= 30000) {
                if (aniosAntiguedadEmpleo >= 2) {
                    System.out.println("PRESTAMO APRAVADO.!");
                } else {
                    System.out.println("ANTIGUEDAD INSUFIENTE.");
                }
            } else {
                System.out.println("SALARIO INSUFIENTE.");
            }
        } else {
            System.out.println("EDAD FUERA DEL RANGO.");
        }
    }
}
