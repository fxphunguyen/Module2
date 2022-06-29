package demo.testInterface;

public class Bird extends Animal implements Soundable {
    @Override
    String sleep() {
        return "Chim ngủ";
    }

    @Override
    String eat() {
        return "Chim ăn sâu, quả...";
    }

    @Override
    public String howtoNoise() {
        return "Chim hót Vũ Vũ Vũ";
    }

    public void display() {
        System.out.println(sleep());
        System.out.println(eat());
        System.out.println(howtoNoise());
    }
}
