package Mang;

import java.util.Arrays;

public class Push_value {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4"};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = "7";
        System.out.println("Mảng khi được thêm:\n" + Arrays.toString(arr));
    }
}
