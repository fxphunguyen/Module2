package Mang;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter elemen " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elemens in array", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
    }
}
