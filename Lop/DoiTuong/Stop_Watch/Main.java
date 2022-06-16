package Lop.DoiTuong.Stop_Watch;

public class Main {
    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        a.start();
        int [] arr = a.randomArray(200000);
        a.selectionSort(arr);
        a.stop();
        System.out.println(a.getElapsedTime());
    }

}