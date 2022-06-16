package thuat_toan;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {90, 5, 20, 15, 17, 13};
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    // Phương thức sắp xếp chèn
//    void sort(int arr[]) {
//        for (int i = 1; i < arr.length; ++i) {
//            int key = arr[i];
//            int j = i - 1;
//
//            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
//            // đến một vị trí trước vị trí hiện tại của chúng
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    // In các phần tử của mảng
    static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");

        System.out.println();
    }

}

