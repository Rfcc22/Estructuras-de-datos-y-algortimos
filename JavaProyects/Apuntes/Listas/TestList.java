package Apuntes.Listas;

import java.util.Random;

public class TestList {
    public static void main(String[] args) {
        Random random = new Random();
        Lista lista = new Lista();

        int num = 0;

        for (int i = 0; i < 5; i++) {
            num = random.nextInt(0,100);
            lista.insertFinal(num);
        }
        lista.insertFinal("HOLA");
        lista.print();
    }
}
