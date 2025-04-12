package co.edu.uniquindio.poo.Colas;

public class Cola <T>{
    protected Nodo<T> inicial;
    protected Nodo<T>fin;
    protected int tamanio;

    public Cola() {
        this.inicial = this.fin = null;
        this.tamanio = 0;
    }

    public void encolar (T value) {
        Nodo<T> newNodo = new Nodo<>(value);
        if (isVacia()) {
            inicial = newNodo;
            fin = newNodo;
        } else {
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
        tamanio++;
    }
    public void desencolar() { // Eliminar el parámetro
        if (isVacia()) return;
        inicial = inicial.getSiguiente();
        if (inicial == null) fin = null; // Si se vacía la cola
        tamanio--;
    }

    public boolean isVacia() {
        return inicial == null;
    }

}
