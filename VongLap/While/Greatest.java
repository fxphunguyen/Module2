package VongLap.While;


import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        // Khai báo số nguyên a,b nhập từ bàn phím
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        // Hàm trả về trị tuyệt đối của a,b
        a = Math.abs(a);
        b = Math.abs(b);

        // Kiểm tra a,b
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        // Tìm ước chung của a,b
        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor:" + a);
    }
}
