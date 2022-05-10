package danh_sach.method_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listNames = new MyList<>(10);
        listNames.add(5,"a");
        listNames.add(4,"b");
        listNames.add(1,"c");
        listNames.add(2,"d");
        listNames.add(3, "e");
        //listNames.clear();
        listNames.printMyList();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        listNames.remove(3);
        listNames.printMyList();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

        MyList<Number> listNumber = new MyList<>(7);
        listNumber.add(1,2);
        listNumber.add(2, 3);
        listNumber.add(3, 4);
        listNumber.add(4, 5);
        listNumber.add(5, 6);
        listNumber.printMyList();
        if (listNumber.contains(1)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");

    }
}
