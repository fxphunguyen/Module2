package Lop.DoiTuong.Quadratic_Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return (Math.pow(this.b,2)) - (4 * a * c);
    }

    public double getRoot1() {
        return (-this.b + (Math.sqrt(getDiscriminant()))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - (Math.sqrt(getDiscriminant()))) / (2 * this.a);
    }

    public double uniqueExqerience() {
        return -(this.b / (2 * this.a));
    }
}
