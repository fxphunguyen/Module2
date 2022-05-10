package stack_queue.swap_stack;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static Stack<Integer> reverseOfInteger() {
        int size, element = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        size = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            element = Integer.parseInt(scanner.nextLine());
            stack.push(element);
        }

        Stack<Integer> newstack = new Stack<>();
        for (int i = 0; i < size; i++) {
            newstack.push(stack.pop());
        }
        return newstack;
    }

    public static void main(String[] args) {
        System.out.println(reverseOfInteger());
    }
}
