package Abstract_Interface.Animals_Transports;

public class Bird extends Animal implements Flyable{
    @Override
    String howtoEat() {
        return "";
    }

    @Override
    String sleep() {
        return "Chim không ngủ";
    }

    @Override
    public String howtoFly() {
        return "Chim có thể bay";
    }

    @Override
    public String flyBy() {
        return "Chim bay bằng cánh";
    }
}
