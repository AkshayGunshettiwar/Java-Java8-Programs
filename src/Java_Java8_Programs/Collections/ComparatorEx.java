package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(234);
        values.add(458);
        values.add(633);
        values.add(347);

//        Comparator<Integer> c=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1%10>o2%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        //using java 8
        Comparator<Integer> c=(i,j)-> i%10>j%10?1:-1;

        Collections.sort(values, c);
        for (Integer o:values){
            System.out.println(o);
        }
    }
}
