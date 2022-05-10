package stack_queue.stack_array;

public class MyStack {
    private int arr[];
    private int capacity;
    int size = 0;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[size] = element;
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--size];
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    public int size() {
     return size;
    }
}
