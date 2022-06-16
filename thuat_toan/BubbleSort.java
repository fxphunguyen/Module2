package thuat_toan;

public class BubbleSort {
    static int[] arr = {3, 6, 91, -2, 4, 7};

    public static void bubbleSort(int[] arr) {
       int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arr);
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
