package Abstract_Interface.Animals_Fruits;

public class Chicken extends Animal implements Edible{
    @Override
    String makeSound() {
        return "Gà kêu Tục tác";
    }

    @Override
    public String howtoEat() {
        return "Gà nướng";
    }
}
