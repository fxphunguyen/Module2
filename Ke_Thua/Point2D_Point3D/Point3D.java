package Ke_Thua.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + Arrays.toString(getXYZ());
    }
}
