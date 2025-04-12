package co.edu.uniquindio.poo.Colas;

public class BiCola<T> extends Cola<T> {

    public BiCola() {
        super();
    }

    public void encolarInicio(T value) {
        Nodo<T> newNodo = new Nodo<>(value);
        if (isVacia()) {
            inicial = fin = newNodo;
        } else {
            newNodo.setSiguiente(inicial);
            inicial = newNodo;
        }
        tamanio++;
    }

    //EliminarFin - Metodo para eliminar al final de la Bicola
    public void desencolarFinal() {
        if (!isVacia()) {
            if (inicial == fin) {
                inicial = fin = null;
            } else {
                Nodo<T> nodoRecorrer = inicial;
                while (nodoRecorrer.getSiguiente() != fin) {
                    nodoRecorrer = nodoRecorrer.getSiguiente();
                }
                nodoRecorrer.setSiguiente(null); // Corregido
                fin = nodoRecorrer;
            }
            tamanio--;
        }
    }
}
