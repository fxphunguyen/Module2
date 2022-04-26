package Access_Static.Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, "red");
        circle1.getRadius();
        System.out.println("Bán kính hình tròn là: " + circle1.getRadius());
        circle1.getArea();
        System.out.println("Diện tíc hình tròn là: " + circle1.getArea());
    }
}
