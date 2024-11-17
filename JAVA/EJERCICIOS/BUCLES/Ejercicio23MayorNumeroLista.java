package JAVA.EJERCICIOS.BUCLES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION:
Calcular el mayor numero de una lista.
 */
import java.util.Arrays;
import java.util.List;
public class Ejercicio23MayorNumeroLista {
    public static void main(String[] args) {
        // Cremos la lista
        List<Integer> listaNumeros = Arrays.asList(1,2,3,44,67,3);
        // variable euxiliar para el numero mayor 
        int numeroMayor = -9999;
        // recorremos la lista y buscamos el mayor 
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (numeroMayor < listaNumeros.get(i)) {
                numeroMayor = listaNumeros.get(i);
            }
        }
        // mostramos el numero mayor
        System.out.println("Numero mayor de la lista: "+numeroMayor);
    }
}
