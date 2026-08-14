package Apuntes;

import java.util.Random;
public class Actividad1
{
    public static void main(String[] args) {
        int arrayLenght = 10;
        boolean fullSeats = false;

        Random randomSeat = new Random();

        int assientosCine[] = new int[arrayLenght];


        for (int i  = 0; i < arrayLenght; i++){
            assientosCine[i] = randomSeat.nextInt(2);
        }

        for (int x = 0; x < arrayLenght; x++){
            if (assientosCine[x] == 0) {
                System.out.println("Hay un asiento vacio en el asiento nuemero " + (x+1));
                break;
            }
            if (x == 9) {
                fullSeats = true;
                System.out.println("Estan llenos los asientos");
            }
        }
    }
}