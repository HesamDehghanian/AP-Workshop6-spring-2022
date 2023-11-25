public class Eagle extends Bird implements Hunter {

    public Eagle(int row, String name, int age, int heigtFly, String animalSpecial) {
        super(row, name, age, heigtFly, animalSpecial);
    }

    @Override
    public void hunt(Prey prey1) {
        System.out.println("Eagle hunted "+ prey1);
    }
}
