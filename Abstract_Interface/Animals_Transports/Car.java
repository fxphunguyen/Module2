package Abstract_Interface.Animals_Transports;

public class Car extends Transport implements Runable{
    @Override
    int speedUp() {
        return 350;
    }

    @Override
    public String howtoRun() {
        return "Xe chạy 350 Km/h";
    }

    @Override
    public String runBy() {
        return "Chạy bằng động cơ";
    }
}
