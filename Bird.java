import java.lang.*;
import java.util.*;
public class Bird extends Animal{
    int heigtFly;
    public Bird(int row, String name, int age,int heigtFly , String animalSpecial) {
        super(row, name, age, animalSpecial);
        this.heigtFly = heigtFly;
    }
    @Override
    void show() {
        System.out.println(
                row+ ".name: "
                +name+ ", age: "
                +age+", height of fly: "
                +heigtFly+", animal special: "
                +animalSpecial);
    }

}