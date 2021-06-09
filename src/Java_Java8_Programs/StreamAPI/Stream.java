package Java_Java8_Programs.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","d","b","e");

        List<String> newList=list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list:"+newList);
    }
}
