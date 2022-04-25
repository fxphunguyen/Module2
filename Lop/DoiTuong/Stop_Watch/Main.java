package Lop.DoiTuong.Stop_Watch;

public class Main {
    public static void main(String[] args) {
//        stopWatch stopWatch = new stopWatch();
//        stopWatch.start();
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        //stopWatch.getEndTime();
//        stopWatch.stop();
//        System.out.println(stopWatch.getElapsedTime());
        StopWatch a = new StopWatch();
        a.start();
        int [] arr = a.randomArray(200000);
        a.selectionSort(arr);
        a.stop();
        //a.getElapsedTime();
        System.out.println(a.getElapsedTime());
    }

}
