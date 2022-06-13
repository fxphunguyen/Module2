package danh_sach;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.addFirst(5);
        linkedList.add(1,6);
        linkedList.remove(3);
        System.out.println("Các phần tử có trong linkedList là: ");
        for (int node : linkedList) {
            System.out.println(node + "\t");
        }

    }
}
