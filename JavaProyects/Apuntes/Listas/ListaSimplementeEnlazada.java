package Apuntes.Listas;

public class ListaSimplementeEnlazada {
    Nodo primerNodo;
    Nodo ultimoNodo;

    //Cuando se crear por primera vez una lista va a tener un nodo

    ListaSimplementeEnlazada(){
        primerNodo = ultimoNodo = null; //El primer y ultimo nodo apuntan a null
    }

    public void insertFinal(Object element) {
        if (isEmpty()) {
            primerNodo = ultimoNodo = new Nodo(element);
        } else {
            ultimoNodo = ultimoNodo.siguiente = new Nodo(element);
        }
    }

    public void insertStart(Object element) {
        if (isEmpty()) {
            primerNodo = ultimoNodo = new Nodo(element);
        } else {
            primerNodo = new Nodo(element, primerNodo);
        }
    }

    public void insertBefore(Object newElement, Object reference) {
        if (isEmpty()) {
            System.out.println("Esta vacia la lista no se puede imprimir antes de algo");
            return;
        }

        if (primerNodo.data.equals(reference)) {
            insertStart(newElement);
            return;
        }

        Nodo currentNode = primerNodo;
        Nodo previousNode = null;

        while (currentNode != null && !currentNode.data.equals(reference)){
            previousNode = currentNode;
            currentNode = currentNode.siguiente;
        }

        if (currentNode == null) {
            System.out.println("No esta el nodo");
        } else {
            Nodo newNode = new Nodo(newElement,currentNode);
            if (previousNode != null) {
                previousNode.siguiente = newNode;
            }
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
