package JAVA.EJERCICIOS.BUCLES;
/*
EJERCICIO DE LOGICA DE PROGRAMACION
Hacer un programa que verifique en estado(Descendente,Ascentdente
,Desordenada) esta un lista de numeros enteros.
 */
import java.util.Arrays;
import java.util.List;
public class Ejercicio22VerOrdenLista {
    public static void main(String[] args) {
        // cremos la lista 
        List<Integer> listaNumeros = Arrays.asList(1,5,4,2,7);
        // variables banderas
        boolean descendente = false;
        boolean ascendente = false;
        // recorremos la lista
        for(int i = 0; i < listaNumeros.size() - 1; i++){
            if (listaNumeros.get(i) > listaNumeros.get(i+1)) {
                descendente = true;
            } else {
                ascendente = true;
            }
        }
        // mostramos el estado 
        if (ascendente && descendente) {
            System.out.println("La lista esta desordenada");
        } else if (ascendente) {
            System.out.println("La lista esta en forma ascendente");
        } else {
            System.out.println("La lista esta en forma descendente");
        }
    }
}
