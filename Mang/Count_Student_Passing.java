package Mang;

import java.util.Scanner;

public class Count_Student_Passing {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng học sinh: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập số điểm của học sinh: " + (i +1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println("\n Số học sinh đủ điểm là " + count);
    }
}
