public class Giraff extends Mammal implements Prey{


    public Giraff(int row, String name, int age, String animalSpecial, int speed) {
        super(row, name, age, animalSpecial, speed);
    }


    @Override
    public String getName() {
        return "Giraff";
    }
}