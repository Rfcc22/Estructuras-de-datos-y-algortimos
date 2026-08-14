package Apuntes;

import java.util.Scanner;


public class Notas2 {
    public static Scanner input = new Scanner(System.in);
    public static int[] numberArray = new int [6];
    public static int currentInput;

    public static void addArray(){
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
    }

    public static void printArray() {
        for (int j : numberArray) {
            System.out.print(" " + j);
        }
    }

    public static void replaceRemoveArrayElement() {

    }



    public static void main(String[] args) {
        //Insertar elementos en un array en java
        addArray();
        printArray();



        //Ordenar arrays






    }


}


