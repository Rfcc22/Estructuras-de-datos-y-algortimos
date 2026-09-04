import java.util.Scanner;
import java.util.Stack;
public class AnalisisdeParentesis {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("Escribe la ecuacion:\n");
        String ecuation = input.nextLine();
        char currentCharacter;
        for (int i = 0; i < ecuation.length(); i++){
            currentCharacter = ecuation.charAt(i);
            if (currentCharacter == '('){
                stack.push("(");
            }
            if (currentCharacter == ')'){
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            System.out.println("hay un error en la ecuacion");
        } else {
            System.out.println("No hay erores en la ecuacion");
        }
    }








}
