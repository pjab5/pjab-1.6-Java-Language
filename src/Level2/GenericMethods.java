package Level2;

import java.util.ArrayList;

public class GenericMethods <T> {
    void genericMethod1(T obj1, String obj2, T obj3){
        System.out.println("Object1: " + obj1 + ", Object2: " + obj2 + ", Object3: " + obj3);
    }

    void genericMethod2(ArrayList<Object> obj){
        System.out.println("\nList contents:");
        for (Object object: obj){
            System.out.println(object);
        }
    }
}
