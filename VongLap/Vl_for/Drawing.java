package VongLap.Vl_for;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        // Vẽ hình chữ nhật

//        int height;
//        int weight;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập chiều cao: ");
//        height = scanner.nextInt();
//        System.out.print("Nhập chiều rộng: ");
//        weight = scanner.nextInt();
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= weight; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//
//    }

        // Vẽ hình tam giác vuông, cạnh vuông ở botton-left

//        int height;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập chiều cao: ");
//        height = scanner.nextInt();
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }

        // Vẽ hình tam giác vuông, cạnh nằm ở top-left

//        Scanner scanner = new Scanner(System.in);
//        int height;
//        System.out.print("Nhập chiều cao: ");
//        height = scanner.nextInt();
//        for (int i = height; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }

    // Vẽ hình tam giác cân

        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ cao của tam giác: ");
        height = scanner.nextInt();
        for (int i = 0;i<height;i++){
            for (int j =0; j<height - i;j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2*i-1; k++){
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}

