public class Cheetah extends Mammal implements Hunter {


    public Cheetah(int row, String name, int age, String animalSpecial, int speed) {
        super(row, name, age, animalSpecial, speed);
    }

    @Override
    public void hunt(Prey prey1) {
        System.out.println("Cheetah hunted " + prey1);
    }
}
