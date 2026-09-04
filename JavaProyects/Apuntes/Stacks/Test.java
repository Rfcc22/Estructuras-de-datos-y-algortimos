public class Test {
    public static void main(String[] args){

        EjemploStacks stack = new EjemploStacks(5);

        System.out.println("Esta vacia? " + stack.isEmpty());

        stack.push(22);

        System.out.println("Esta vacia? " + stack.isEmpty());

        stack.push(14);
        stack.push(44);
        stack.push(90);
        stack.push(87);
        stack.push(100);

        System.out.println("Esta llena? " + stack.isFull());
        System.out.println(stack);

        int data = stack.pop();
        int data2 = stack.pop();
        int data3 = stack.pop();

        System.out.println(stack);
    }
}
