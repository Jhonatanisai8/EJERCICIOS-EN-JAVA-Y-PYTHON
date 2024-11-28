package JAVA.EJERCICIOS.BUCLES;

/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Imprime una figura geometrica con asteriscos. 
Crea un programa que imprima figuras geometricas 
simples usando asteriscos.
Como por ejemplo un cuadrado.
Ejemplo:
el usuario ingresa la longitud de los lados 
en este caso 5.
se debe mostrar la siguiente figura.

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
public class Ejercicio30FiguraGeometrica {
    public static void main(String[] args) {
        // longitud de ejemplo
        
        int lado = 5;
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
