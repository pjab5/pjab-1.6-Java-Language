package Level2;

import Level1.NoGenericMethods;
import Level1.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods<Person> persons1 = new GenericMethods<>();
        persons1.genericMethod1(new Person("Leland","Palmer",45),"Black Lodge",new Person("Audrey","Horne",19));

        GenericMethods<Integer> var = new GenericMethods<>();
        var.genericMethod2(new ArrayList<>(Arrays.asList("1",2,new Person("Pepe","Gotera",34))));

    }
}