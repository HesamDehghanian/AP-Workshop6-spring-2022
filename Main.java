import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> arr = new ArrayList<>();
        arr.add(new Parrot( 1 ,  "Khoshkel", 22 , 200 ,"beautiful"));
        arr.add(new Eagle ( 2 ,  "tiz", 24 , 300 ,"powerful eyes"));
        arr.add(new Giraff( 3 ,  "boland", 16 , "tallest foot",30));
        arr.add(new Cheetah( 4 ,  "asabi", 18 , "fastest" ,180));
        for (Animal animal : arr){
            animal.show();
        }

    }
}