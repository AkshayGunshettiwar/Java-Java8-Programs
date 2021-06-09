package Java_Java8_Programs.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachLoop {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,5,7);

        //simple for loop
        for (int i=0 ; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //enhanced for loop
        for (int i:list){
            System.out.println(i);
        }

        //forEach Loop
        list.forEach(i-> System.out.println(i));    //Implementation of consumer interface
    }
}
