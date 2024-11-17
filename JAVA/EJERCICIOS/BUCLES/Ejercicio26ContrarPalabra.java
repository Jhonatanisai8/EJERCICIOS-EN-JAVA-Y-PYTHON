package JAVA.EJERCICIOS.BUCLES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION: 
Solicita al usuario una palabra 
y cuenta cuántas vocales tiene:
Ejemplo: Si el usuario ingresa "Python", 
el programa debe mostrar: 
Cantidad de vocales que tiene 
la cadena ingresada es 1.
 */
import java.util.Scanner;
public class Ejercicio26ContrarPalabra {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        String[] listaVocales = { "a", "e", "i", "o", "u" };
        String cadena;
        int contadorVocales = 0;
        // pedimos al usuario el dato
        System.out.print("Ingrese una palabra o frase: ");
        cadena = entrada.nextLine();
        /*procemos a contar cuantas vocales tiene la
         cadena ingresada.*/
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < listaVocales.length; j++) {
                if (String.valueOf(cadena.charAt(i)).equalsIgnoreCase(listaVocales[j])) {
                    contadorVocales++;
                }
            }
        }
        // mostramos la cantidad de vocales
        System.out.println("Cantidad de vocales que tiene "+
        "\nla cadena ingresada es: "+contadorVocales);
    }
}
