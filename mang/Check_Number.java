package mang;

public class Check_Number {
   public static void main(String[] args) {
       System.out.println("Gia tri lon nhat la: "+ checkNumber() );
       
   }

    public static int checkNumber(){
        int[] arr = {10, 3, 2, 20, 7, 9, 6};
        int max = Integer.MIN_VALUE;
        for (int item : arr) {
           if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
