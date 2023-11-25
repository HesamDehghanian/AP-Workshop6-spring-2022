import java.util.*;
import java.lang.*;
abstract class Mammal extends Animal {
    int speed;
    public Mammal(int row, String name, int age, String animalSpecial,int speed) {
        super(row, name, age, animalSpecial);
        this.speed = speed;
    }

    void show() {
        System.out.println(
                row+ ".name: "
                        +name + ", age: "
                        +age + ", animal special: "
                        +animalSpecial+", animal speed: "
                        +speed);
    }


}
