package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5);

        for (Object o:list){
            System.out.println(o);
        }
    }
}
