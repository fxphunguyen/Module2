package Lop.DoiTuong;


public class Rectangle {
    double width, height;
// Khai báo các thuộc tính, định nghĩa các phương thức khởi tạo
    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
//Định nghĩa phương thức getArea(), getPrimeter(), display()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPrimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangleơ{" + " width = " + width + ", height = " + height + "} ";
    }
}

