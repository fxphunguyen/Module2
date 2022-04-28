package Abstract_Interface.Animal_Fruit;

public class Chicken extends Animal implements Edible{
    @Override
    String makeSound() {
        return "Gà kêu Tục tác";
    }

    @Override
    public String howtoEat() {
        return "Gà ăn được";
    }
}
