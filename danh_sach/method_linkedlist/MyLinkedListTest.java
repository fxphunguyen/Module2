package danh_sach.method_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList("");
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        System.out.println(list.indexOf("Melinda"));
        list.remove(3);
        list.addLast(3);
        list.printList();

        System.out.println();


    }
}
