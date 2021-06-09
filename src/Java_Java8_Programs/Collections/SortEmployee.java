package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
    public static void main(String[] args) {

        ArrayList<String> s=new ArrayList<String>();
        s.add("sahil");
        s.add("akshay");
        s.add("gitesh");
        s.add("prathmesh");

//        Collections.sort(s);
      //  Collections.reverse(s);
        Collections.shuffle(s);

//        System.out.println("List after use of sort:"+s);
        System.out.println("List after use of sort:"+s);


    }
}
