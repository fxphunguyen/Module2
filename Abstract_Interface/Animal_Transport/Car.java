package Abstract_Interface.Animal_Transport;

public class Car extends Transport implements Runable{
    @Override
    int speedUp() {
        return 350;
    }

    @Override
    public String howtoRun() {
        return "Xe chạy 350 Km/h";
    }
}
