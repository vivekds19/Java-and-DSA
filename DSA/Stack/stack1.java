
import java.util.Stack;

public class stack1 {

    public static void main(String[] at) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek()); //30
        System.out.println(stack.pop());  //30
        System.out.println(stack.peek()); //20
    }

}
