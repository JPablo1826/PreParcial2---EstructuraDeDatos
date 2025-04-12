package co.edu.uniquindio.poo.Pilas;

public class Pila <T>{
    private Nodo<T> cima;
    private int tamanio;

    public Pila (){
        cima = null;
        tamanio=0;
    }
    public void insertar (T value){
        Nodo<T> newNodo = new Nodo<>(value);
        if (esVacia()){
            cima=newNodo;
        }else{
            newNodo.setSiguiente(cima);
            cima=newNodo;
        }
        tamanio++;
    }
    //POP - Quitar elemento de la cima de la pila
    public void eliminar(){
        if(!esVacia()){
            cima=cima.getSiguiente();
            tamanio--;
        }
    }

    public boolean esVacia(){
        return cima == null;
    }

    public T cima(){
        if(!esVacia()){
            return cima.getDato();
        }
        return null;
    }

}
