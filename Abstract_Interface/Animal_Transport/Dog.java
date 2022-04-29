package Abstract_Interface.Animal_Transport;

public class Dog extends Animal implements Barkable,Runable{
    @Override
    String howtoEat() {
        return "Chó giả cầy";
    }

    @Override
    String sleep() {
        return "Chó không ngủ";
    }

    @Override
    public String howtoBark() {
        return "Chó sủa gâu gâu";
    }

    @Override
    public String howtoRun() {
        return "Chó chạy ngoài đồng";
    }
}
