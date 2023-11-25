public class Parrot extends Bird implements Prey{

    public Parrot(int row, String name, int age,int heightFly ,String animalSpecial) {
        super(row, name, age,heightFly ,animalSpecial);
    }



    @Override
    public String getName() {
        return "parrot";
    }
}