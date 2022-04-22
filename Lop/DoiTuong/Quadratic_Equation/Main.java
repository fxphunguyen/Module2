package Lop.DoiTuong.Quadratic_Equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDiscriminant());
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm: " + "x = " + (-c/b));
            }
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm " + " Nghiệm 1 = " + quadraticEquation.getRoot1() + " và " +
                    "Nghiệm 2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + quadraticEquation.uniqueExqerience());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
