package JAVA.EJERCICIOS.CONDICIONALES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Crea un programa que pida al usuario tres calificaciones
y calcule si la media de las tres es suficiente para 
aprobar. Considera que la media debe ser 11 o 
más para aprobar.*/
import java.util.Scanner;

public class Ejercicio09CalcularNotaFinal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double nota01, nota02, nota03, media;

        // pedimos las notas al usuario
        System.out.print("POR FAVOR INGRESE LA NOTA Nº1: ");
        nota01 = entrada.nextDouble();
        System.out.print("POR FAVOR INGRESE LA NOTA Nº2: ");
        nota02 = entrada.nextDouble();
        System.out.print("POR FAVOR INGRESE LA NOTA Nº3: ");
        nota03 = entrada.nextDouble();

        // calculamos la media
        media = (nota01 + nota02 + nota03) / 3;

        System.out.println("Promedio Obtenido: "+media);
        if (media >= 11) {
            System.out.println("Felicitaciones has aprovado el curso....");
        } else {
            System.out.println("Esfuerzate un poco mas....");
        }

    }
}
