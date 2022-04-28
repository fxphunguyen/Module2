package Abstract_Interface;

abstract class Animal {
    abstract String sleep();

    abstract String eat();

    abstract String noise();
}

class Dog extends Animal {

    @Override
    String noise() {
        return "chó sủa gâu gâu";
    }

    @Override
    String sleep() {
        return "Chó ngủ 12-14 tiếng mỗi ngày";
    }

    @Override
    String eat() {
        return "Chó ăn tạp";
    }

    public void display() {
        System.out.println("sleep: " + sleep());
        System.out.println("eat: " + eat());
        System.out.println("noise: " + noise());
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();

    }
}
