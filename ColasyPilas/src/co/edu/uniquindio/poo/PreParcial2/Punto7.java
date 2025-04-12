package co.edu.uniquindio.poo.PreParcial2;

import java.util.LinkedList;
import java.util.List;

public class Punto7 {

    //insertar un 2 si la suma de la lista ya está como valor en la lista
    public static void insertarSiSumaExiste(LinkedList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == suma) {
                lista.add(i + 1, 2); // Insertar 2 después del valor igual a la suma
                break; // Solo una vez
            }
        }
    }

    //añadir número, y si coincide con la suma, también añadir un 2
    public static void agregarNumero(LinkedList<Integer> lista, int numero) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }

        lista.add(numero);

        if (numero == suma) {
            lista.add(2);
        }
    }

    public static void main(String[] args) {
        // Ejemplo 1
        LinkedList<Integer> lista1 = new LinkedList<>(List.of(1, 2, 3, 2, -6));
        System.out.println("Lista original 1: " + lista1);
        insertarSiSumaExiste(lista1);
        System.out.println("Lista modificada 1: " + lista1); // [1, 2, 3, 2, 2, -6]

        // Ejemplo 2
        LinkedList<Integer> lista2 = new LinkedList<>(List.of(1, 3, 8, 4));
        int numero2 = 16;
        System.out.println("\nLista original 2: " + lista2);
        System.out.println("Número a añadir: " + numero2);
        agregarNumero(lista2, numero2);
        System.out.println("Lista modificada 2: " + lista2); // [1, 3, 8, 4, 16, 2]

        // Ejemplo 3
        LinkedList<Integer> lista3 = new LinkedList<>(List.of(1, 4, 5));
        int numero3 = 8;
        System.out.println("\nLista original 3: " + lista3);
        System.out.println("Número a añadir: " + numero3);
        agregarNumero(lista3, numero3);
        System.out.println("Lista modificada 3: " + lista3); // [1, 4, 5, 8]

        // Ejemplo 4
        LinkedList<Integer> lista4 = new LinkedList<>(List.of(5, 1, 3, -4));
        int numero4 = 5;
        System.out.println("\nLista original 4: " + lista4);
        insertarSiSumaExiste(lista4);
        System.out.println("Número a añadir: " + numero4);
        agregarNumero(lista4, numero4);
        System.out.println("Lista modificada 4: " + lista4); // [5, 1, 3, -4, 5, 2]

    }

}
