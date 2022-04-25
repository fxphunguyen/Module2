package Lop.DoiTuong.Stop_Watch;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public int[] randomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (new Random()).nextInt(size) + 1;
        }
        return array;
    }

    public  void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

}
