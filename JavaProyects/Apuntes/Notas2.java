package Apuntes;

import java.util.Scanner;

public class Notas2 {
    public static void Main(String[] args) {
        //Insertar elementos en un array en java

        Scanner input = new Scanner(System.in);
        int[] numberArray = new int [6];
        int currentInput;

        for (int i = 0; i < numberArray.length; i++) {
            while (true) {
                try {
                    System.out.println("Escribe un numero a anadir a el array");
                    currentInput = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Escribe un numero" + e.getMessage());
                }
            }
            numberArray[i] = currentInput;
        }

        for (int i = 0; i < numberArray.length; i++){
            System.out.print(" " + numberArray[i]);
        }




    }

}


