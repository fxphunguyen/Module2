package Mang;

import java.util.Scanner;

public class Sum_Main_Matrix {
    public static void main(String[] args) {
        int n; // bậc thang của ma trận vuông
        int sum = 0;
        System.out.println("Nhập kích thước của mảng: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int Array[][]= new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Array["+ i +"]["+ j +"] =");
                Array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận Array vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // Các phần tử trên đường chéo chính là các phần tử có chỉ số dòng bằng chỉ số cột
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Kiểm tra nếu i==j thì mới tính tổng
                if (i == j) {
                    sum += Array[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
    }
}
