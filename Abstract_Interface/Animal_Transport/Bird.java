package Abstract_Interface.Animal_Transport;

public class Bird extends Animal implements Flyable{
    @Override
    String howtoEat() {
        return "Chim nướng";
    }

    @Override
    String sleep() {
        return "Chim không ngủ";
    }

    @Override
    public String howtoFly() {
        return "Chim có thể bay";
    }
}
