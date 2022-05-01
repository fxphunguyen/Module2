package Abstract_Interface.Animals_Transports;

public class Dog extends Animal implements Barkable,Runable{
    @Override
    String howtoEat() {
        return "";
    }

    @Override
    String sleep() {
        return "Chó ngủ 12-14 tiếng mỗi ngày";
    }

    @Override
    public String howtoBark() {
        return "Chó sủa gâu gâu";
    }

    @Override
    public String howtoRun() {
        return "Chó chạy ngoài đồng";
    }

    @Override
    public String runBy() {
        return "Chó chạy bằng chân";
    }
}
