package Lop_Doituong;

public class Insertion_Sort {
    public static void main(String args[]) {
        int arr[] = {25, 13, 4, 6, 3, 21, 8, 10};
        System.out.println("Mảng ban đầu:" );
        printArray(arr);
        Insertion_Sort ob = new Insertion_Sort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    // Phương thức sắp xếp chèn
    void sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}

