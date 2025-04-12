package co.edu.uniquindio.poo.PreParcial2;

import co.edu.uniquindio.poo.Pilas.Pila;

public class Punto5 {

    public static <T> boolean estanBalanceados(String expresion) {
        Pila<T> pila = new Pila<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            // Insertamos el carácter
            if (c == '(' || c == '[' || c == '{') {
                pila.insertar((T) Character.valueOf(c));
            }

            // Si encontramos un carácter de cierre
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.esVacia()) {
                    return false;
                }

                T top = pila.cima();
                char topChar = (char) top; //Generic a character

                if ((c == ')' && topChar == '(') || (c == ']' && topChar == '[') || (c == '}' && topChar == '{')) {
                    pila.eliminar();
                } else {
                    return false;
                }
            }
        }
        return pila.esVacia();
    }

    public static void main(String[] args) {
        String cadena1 = "(6-7)/4]";
        String cadena2 = "[(1+2)*4]+5";

        System.out.println("La cadena de caracteres '" + cadena1 + "' está balanceada? " + estanBalanceados(cadena1));
        System.out.println("La cadena de caracteres '" + cadena2 + "' está balanceada? " + estanBalanceados(cadena2));
    }
}
