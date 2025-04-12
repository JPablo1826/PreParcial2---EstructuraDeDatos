package co.edu.uniquindio.poo.PreParcial2;

import co.edu.uniquindio.poo.Pilas.Pila;

import java.util.LinkedList;

public class Punto1 {
    public static <T> LinkedList <T> InvertirLista(LinkedList<T> lista){
        Pila<T> pila = new Pila<>();
        for (T element : lista){
            pila.insertar(element);
        }

        LinkedList<T> listaInvertida = new LinkedList<>();

        while (!pila.esVacia()){
            listaInvertida.add(pila.cima());
            pila.eliminar();
        }
        return listaInvertida;
    }
}

