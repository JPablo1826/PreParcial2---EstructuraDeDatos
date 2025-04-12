package co.edu.uniquindio.poo.PreParcial2;

import co.edu.uniquindio.poo.Pilas.Pila;

public class Punto4 {
    public static int convertirABinario (int numeroDecimal){
        if (numeroDecimal ==  0){
            return 0;
        }

        Pila<Integer> pila = new Pila<>();

        while (numeroDecimal > 0){
            pila.insertar(numeroDecimal % 2);
            numeroDecimal /= 2 ;
        }

        int binario = 0;
        int factor = 0;

        while (!pila.esVacia()){
            binario += pila.cima() * factor;
            factor *= 10;
            pila.eliminar();
        }
        return binario;
    }
}
