package Apuntes.Listas;

public class Lista {
    Nodo primerNodo;
    Nodo ultimoNodo;

    //Cuando se crear por primera vez una lista va a tener un nodo

    Lista(){
        primerNodo = ultimoNodo = null; //El primer y ultimo nodo apuntan a null
    }

    public void insertFinal(Object element) {
        if (isEmpty()) {
            primerNodo = ultimoNodo = new Nodo(element);
        } else {
            ultimoNodo = ultimoNodo.siguiente = new Nodo(element);
        }
    }

    public void print(){
        if (!isEmpty()){
            Nodo currentNode = primerNodo;

            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.siguiente;
            }
        }
    }

    boolean isEmpty(){
        return primerNodo == null;
    }

}
