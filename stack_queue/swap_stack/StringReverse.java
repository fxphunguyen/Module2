package stack_queue.swap_stack;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String s = "CodeGym";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str.append(stack.pop());
        }
        System.out.println(str);

    }
}
