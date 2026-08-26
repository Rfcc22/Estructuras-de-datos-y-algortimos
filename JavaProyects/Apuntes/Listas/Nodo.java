package Apuntes.Listas;

public class Nodo {
    Object data; //Object es la clase base de java
    Nodo siguiente;

    Nodo(Object objeto) {
        this(objeto,null); //llama al segundo constructor
    }

    Nodo (Object objeto, Nodo nodo){
        data = objeto;
        siguiente = nodo;
    }

    Object getObject() {
        return data;
    }

    Nodo getNext(){
        return siguiente;
    }

}
