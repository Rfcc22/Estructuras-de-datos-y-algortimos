package Apuntes.Recursividad;

public class Recursividad1 {

    public static void main(String[] args) {
        //factorial recursivo
        System.out.println(factorial(5));
    }

    public static double factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    /*
    * Recursion Directa
    * factorial (n) = n * x -> x es el resultado del la llamada de la funcion anterior
    * factorial(5) = 5  * 24
    * factorial(4) = 4  * 6
    * factorial(3) = 3  * 2
    * factorial(2) = 2  * 1
    * factorial(1) = 1  * 1
    * */






}
