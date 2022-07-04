package stack_queue.decimalToBinary;

import java.util.Stack;

public class Number {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        int n = 56;
        while (n > 0) {
            int a = n % 2;
            stack.push(a);
            n = n / 2;
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }

        System.out.println(str);
    }
}
