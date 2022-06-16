package ke_thua.Point_MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(1,2);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
