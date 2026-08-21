package Apuntes;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas3 {
//Arreglos bidimensionales

    static int arrayColumLenght = 4;
    static int arrayLineLenght = 5;
    static int[][] Map = new int[arrayLineLenght][arrayColumLenght];
    static Scanner input = new Scanner(System.in);


    public static void printArray(){
        for (int c = 0; c < arrayColumLenght; c++){
            for (int l = 0; l < arrayLineLenght; l++){
                System.out.print(" " + Map[l][c] + " ");
            }
            System.out.println();
        }
    }


    public static void resetArray(){
        for (int c = 0; c < arrayColumLenght; c++) {
            for (int l = 0; l < arrayLineLenght; l++){
                Map[l][c] = 0;
            }
        }
        printArray();
    }



    public static void main(String[] args){
        int userLineChoice;
        int userColumnChoice;


        resetArray();

        while (true) {
            try {
                System.out.println("Dime el numero de la fila a elegir!");
                userLineChoice = input.nextInt();
                if (userLineChoice <= arrayLineLenght && userLineChoice >= 0){
                    break;
                } else {
                    System.out.println("Escribe un numero valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escribe un numero!");
                input.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Escribe el numero de la columna a elegir!");
                userColumnChoice = input.nextInt();
                if (userColumnChoice <= arrayColumLenght && userColumnChoice >= 0) {
                    break;
                } else {
                    System.out.println("Escribe un numero valido!");
                    input.nextLine();
                }
            } catch (InputMismatchException e){
                System.out.println("Escribe un numero!");
            }
        }

        Map[userLineChoice][userColumnChoice] = 6;

    }













}
