package Access_Static.Access_Modifier;

public class Circle {
    double radius = 1.0;
    String color = "red";

    Circle() {

    }

    Circle(double r, String red) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
