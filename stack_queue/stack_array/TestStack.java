package stack_queue.stack_array;

public class TestStack {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(4);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Mảng sau khi được thêm: " + myStack.size());
//       System.out.println("Xóa phần tử trong stack: ");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
        System.out.println("Mảng sau khi xóa: " + myStack.size());
    }
}
