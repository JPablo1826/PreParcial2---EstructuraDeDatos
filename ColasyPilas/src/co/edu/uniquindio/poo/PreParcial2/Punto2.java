package co.edu.uniquindio.poo.PreParcial2;

import co.edu.uniquindio.poo.Pilas.Pila;

import java.util.LinkedList;
import java.util.Queue;

public class Punto2 {

    public static Queue<Integer> extraerPrimos(Pila<Integer> pilaOriginal) {
        Queue<Integer> colaPrimos = new LinkedList<>();

        while (!pilaOriginal.esVacia()) {
            int numero = pilaOriginal.cima();
            if (esPrimo(numero)) {
                colaPrimos.add(numero);
            }
            pilaOriginal.eliminar();
        }

        return colaPrimos;
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.insertar(10);
        pila.insertar(7);
        pila.insertar(6);
        pila.insertar(13);
        pila.insertar(4);
        pila.insertar(17);
        pila.insertar(22);

        // Extraer primos a la cola
        Queue<Integer> colaPrimos = extraerPrimos(pila);

        // Imprimir los primos en la cola
        System.out.println("Números primos encontrados en la pila:");
        while (!colaPrimos.isEmpty()) {
            System.out.println(colaPrimos.poll());
        }
    }
}
