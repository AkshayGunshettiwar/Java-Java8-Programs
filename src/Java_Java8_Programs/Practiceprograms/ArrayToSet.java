package Java_Java8_Programs.Practiceprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
    public static void main(String[] args) {
        String[] array={"a","b","c","d"};
        Set<String> set=new HashSet<>(Arrays.asList(array));

        System.out.println("Set:"+set);
    }
}
