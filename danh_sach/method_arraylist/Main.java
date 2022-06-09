package danh_sach.method_arraylist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [] a = {3, 4, 9, 0, 0};
        int index = 1;
        int value = -1;
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                a[i] = value;
            }
        }
        System.out.println(Arrays.toString(a));
//        List<Integer> array = new ArrayList<>(Arrays.asList(a));
//        array.add(1, -1);
//        System.out.println(array);
    }
}
