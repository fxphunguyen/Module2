package Abstract_Interface.colorable;

import ke_thua.Learning_Geometry.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        ke_thua.Learning_Geometry.Shape shape = new ke_thua.Learning_Geometry.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
