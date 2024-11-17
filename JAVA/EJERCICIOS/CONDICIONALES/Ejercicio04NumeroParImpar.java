package JAVA.EJERCICIOS.CONDICIONALES;

import java.util.Scanner;

public class Ejercicio04NumeroParImpar {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        /*variable */
        int numero;

        /*pedimos el numero al usuario */
        System.out.print("INGRESE EL NUMERO POR FAVOR: ");
        numero = leer.nextInt();

        /*evaluamos el numero */
        if (numero % 2 == 0) {
            System.out.println("EL NUMERO "+numero+" ES PAR....");
        } else {
            System.out.println("EL NUMERO "+numero+" ES IMPAR....");
        }
    }
}
