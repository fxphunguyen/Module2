package Abstract_Interface.colorable;

import Ke_Thua.Learning_Geometry.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Ke_Thua.Learning_Geometry.Shape shape = new Ke_Thua.Learning_Geometry.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
