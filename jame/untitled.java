package jame;

import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền cần USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
