package Apuntes.Listas;

import java.util.Random;

public class TestList {
    public static void main(String[] args) {
        Random random = new Random();
        Lista lista = new Lista();
        ListaSimplementeEnlazada lista2 = new ListaSimplementeEnlazada();

        int num = 0;

        for (int i = 0; i < 5; i++) {
            num = random.nextInt(0,100);
            lista.insertFinal(num);
        }
        lista.insertFinal("HOLA");
        lista.insertStart("AAA");
        lista.insertBefore(23,"AAA");
        lista.print();
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            num = random.nextInt(0,100);
            lista2.insertFinal(num);
        }
        lista2.insertFinal("HOLA");
        lista2.insertStart("AAA");
        System.out.println("\n" + lista2);
        lista2.print();
    }
}
