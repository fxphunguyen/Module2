package Abstract_Interface.Animals_Transports;

public class Fish extends Animal implements Swimable{
    @Override
    String howtoEat() {
        return "Cá kho";
    }

    @Override
    String sleep() {
        return "Cá không ngủ";
    }

    @Override
    public String howtoSwim() {
        return "Cá có thể bơi";
    }
}
