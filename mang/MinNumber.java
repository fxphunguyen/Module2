package mang;

public class MinNumber {
    public static void main(String[] args) {
    System.out.println("Giá trị nhỏ nhất là: " + CheckMin());
}
    public static int CheckMin(){
    int [] arr = {1,3,9,0,2,3,5,6,7};
    int min = Integer.MAX_VALUE;
    for (int item : arr){
        if (item < min)
            min = item;
    }
        return min;
    }
}

