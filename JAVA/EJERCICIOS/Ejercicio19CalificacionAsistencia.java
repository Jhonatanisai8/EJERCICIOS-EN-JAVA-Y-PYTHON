package JAVA.EJERCICIOS;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que pida al usuario su promedio de calificaciones
y el porcentaje de asistencia a clases. Para aprobar el curso,
el estudiante debe tener un promedio mayor o igual a 70 y una
asistencia mínima del 80%. Si el estudiante cumple ambos 
criterios, imprime "Aprobado". Si solo uno de los criterios 
es cumplido, imprime "Aprobado condicional". 
Si ninguno de los criterios es cumplido, imprime "Reprobado".
 */

import java.util.Scanner;
public class Ejercicio19CalificacionAsistencia {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        double promedio;
        int porcentajeCalificaciones;
        // pedimos los datos al usuario
        System.out.print("Ingrese por favor el promedio de calificaciones: ");
        promedio = leer.nextDouble();
        System.out.print("Ingrese por favor el porcentaje de asistencias: ");
        porcentajeCalificaciones = leer.nextInt();
        // evaluamos
        // 1º condicional
        if (promedio >= 70 && porcentajeCalificaciones >= 80) {
            System.out.println("APROVADO");
        }
        // 2º condicional
        else if (promedio >= 70 || porcentajeCalificaciones >= 80) {
            System.out.println("APROVADO CONDICIONAL.");
        } else { // 3º condicional
            System.out.println("REPROVADO.");
        }
    }
}
