package Mang;


import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        int[] arr = {1, 2, 4, 8, 6, 9};
        int c, i, n = arr.length;
        for (c = i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
