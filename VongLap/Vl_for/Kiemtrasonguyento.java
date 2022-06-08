package VongLap.Vl_for;

import java.util.Scanner;

public class Kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập number: ");
        int number = scanner.nextInt();
        System.out.printf("%d Số nguyên tố nhỏ hơn là: \n", number);
        int count = 0;
        int i = 2;
        while (count < number){
            if (findPrime(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean findPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                return true;
            } else {
                return false;
            }

        }
    }
    }

