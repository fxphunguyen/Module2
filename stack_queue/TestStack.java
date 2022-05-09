package stack_queue;

public class TestStack {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Mảng sau khi được thêm: " + stack.size());
//       System.out.println("Xóa phần tử trong stack: ");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Mảng sau khi xóa: " + stack.size());
    }
}
