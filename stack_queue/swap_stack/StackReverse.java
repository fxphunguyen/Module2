package stack_queue.swap_stack;

public class StackReverse {
//    public static Stack<Integer> reverseOfInteger() {
//        int size, element = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập kích thước của mảng");
//        size = Integer.parseInt(scanner.nextLine());
//
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
//            element = Integer.parseInt(scanner.nextLine());
//            stack.push(element);
//        }
//
//        Stack<Integer> newstack = new Stack<>();
//        for (int i = 0; i < size; i++) {
//            newstack.push(stack.pop());
//        }
//        return newstack;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseOfInteger());
//    }

    int size;
    int top;
    char[] a;

    boolean isEmpty() {
        return (top < 0);
    }

    StackReverse(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        }else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            char x = a[top--];
            return x;
        }
    }
}
