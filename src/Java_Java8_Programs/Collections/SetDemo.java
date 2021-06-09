package Java_Java8_Programs.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(7);
        set.add(4);
        set.add(7);  //set has all the unique elements, you cannot have duplicate elements here.
        set.add(8);

        for (int i: set){
            System.out.println(i);
        }
    }
}
