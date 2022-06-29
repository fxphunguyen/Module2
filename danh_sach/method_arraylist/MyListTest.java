package danh_sach.method_arraylist;

public class MyListTest {
    public static void main(String[] args) {
//        MyList<String> listNames = new MyList<>(10);
//        listNames.add(0,"a");
//        listNames.add(1,"Tài smile");
//        listNames.add(2,"c");
//        listNames.add(3,"d");
//        listNames.add(4, "e");
//        //listNames.clear();
//        listNames.printMyList();
//        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
//        System.out.println(listNames.size());
//        listNames.remove(3);
//        listNames.printMyList();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

        MyList<Number> listNumber = new MyList<>(7);
        listNumber.add(0, 1);
        listNumber.add(1, 2);
        listNumber.add(2, 3);
        listNumber.add(3, 4);
        listNumber.add(4, 5);
        listNumber.add(5, 6);
        listNumber.add(6, 7);
        listNumber.add(20, 8);
        listNumber.printMyList();
        System.out.println(listNumber.get(4));
        if (listNumber.contains(5)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(5)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");

    }
}
