
import java.util.Arrays;
public class EjemploStacks {
    private int max;
    private int[] stack;
    private int peek;

    public EjemploStacks(int size) {
        this.max = size;
        stack = new int[max];
        peek = -1;
    }

    public void push (int element) {
        stack[++peek] = element;
    }

    public int pop () {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return stack[peek--];
    }

    public boolean isEmpty() {
        return (peek ==  -1);
    }

    public boolean isFull() {
        return (peek == max - 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }



}
