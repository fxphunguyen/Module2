package Abstract_Interface.Animals_Transports;

public class Planes extends Transport implements Flyable{
    @Override
    int speedUp() {
        return 500;
    }

    @Override
    public String howtoFly() {
        return "Máy bay có thể bay 500 Km/h";
    }

    @Override
    public String flyBy() {
        return "Bay bằng động cơ";
    }
}
