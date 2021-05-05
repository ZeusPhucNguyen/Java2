package Java2.Lap1;

import java.util.ArrayList;
import java.util.List;
public class CreateArrayListExample {

    public static void main(String[] args) {
        //creating an arrayList of String
        List<String> animals = new ArrayList<>();


        //Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //Adding an element at a particular index in an Arr
        animals.add(2,"Elephant");

        System.out.println(animals);
    }
}
