package Abstract_Interface.Animal_Transport;

public class Planes extends Transport implements Flyable{
    @Override
    int speedUp() {
        return 500;
    }

    @Override
    public String howtoFly() {
        return "Máy bay có thể bay 500 Km/h";
    }
}
