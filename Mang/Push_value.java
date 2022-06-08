package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Push_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"1","2","3","4"};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        System.out.println("Nhập phần tử mới: ");
        arr[N] = scanner.nextLine();
        System.out.println("Mảng khi được thêm:\n" + Arrays.toString(arr));
    }
}