package Abstract_Interface.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape(4.5);
        shapes[1] = new Shape(5.5);
        shapes[2] = new Shape(2.2);


        for (Shape shape : shapes) {
            System.out.println(shape.getColor());
        }
    }
}

