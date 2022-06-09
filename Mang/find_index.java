package Mang;

import java.util.Scanner;

public class find_index {
    public static void main(String[] args) {
        String chuoi;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        // Duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí i bằng 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " " + "trong chuỗi " + chuoi + " = " + count );
    }
}
