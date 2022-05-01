package Abstract_Interface.Animals_Transports;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Bird();
        animals[2] = new Fish();

        for (Animal animal : animals) {
        //    System.out.println(animal.sleep());
        //    System.out.println(animal.howtoEat());

            if (animal instanceof Dog){
                Barkable barkable = (Dog) animal;
                System.out.println(barkable.howtoBark());
                Runable runable = (Dog) animal;
                System.out.println(runable.howtoRun());
                System.out.println(runable.runBy());
            }
            if (animal instanceof Bird){
                Flyable flyable = (Bird) animal;
                System.out.println(flyable.howtoFly());
                System.out.println(flyable.flyBy());
            }
            if (animal instanceof Fish){
                Swimable swimable = (Fish) animal;
                System.out.println(swimable.howtoSwim());
            }
        }

        Transport[] transports = new Transport[2];
        transports[0] = new Car();
        transports[1] = new Planes();

        for (Transport transport : transports) {
        //    System.out.println(transport.speedUp());

            if (transport instanceof Car){
                Runable runable = (Car) transport;
                System.out.println(runable.howtoRun());
                System.out.println(runable.runBy());
            }

            if (transport instanceof Planes){
                Flyable flyable = (Planes) transport;
                System.out.println(flyable.howtoFly());
                System.out.println(flyable.flyBy());
            }

        }

    }
}
