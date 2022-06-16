package mang;

import java.util.Scanner;

public class CheckMax_MaTran {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        m = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        n = scanner.nextInt();

        int Array[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Array["+ i +"]["+ j +"] = ");
                Array[i][j] = scanner.nextInt();
            }
        }
        int max = Array[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < Array[i][j]) {
                    max = Array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
