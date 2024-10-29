package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods abc = new NoGenericMethods("a", "b", "c");
        NoGenericMethods bca = new NoGenericMethods("b", "c", "a");
        NoGenericMethods cab = new NoGenericMethods("c", "a", "b");
        System.out.println(abc.getA()==bca.getC()&&abc.getA()==cab.getB());
        GenericMethods<Person> persons = new GenericMethods<>();

        persons.genericMethod(new Person("Dale","Cooper",35),new Person("Bob","",40),new Person("Laura","Palmer",17));
        GenericMethods<String> strings = new GenericMethods<>();
        strings.genericMethod("one","two","three");
        GenericMethods<Double> doubles = new GenericMethods<>();
        doubles.genericMethod(1.2,2.3,3.4);

    }
}