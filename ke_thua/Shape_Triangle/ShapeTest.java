package ke_thua.Shape_Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(3, 4, 5);
        triangle1.getPerimeter();
        triangle1.getArea();
        System.out.println(triangle1);
    }
}