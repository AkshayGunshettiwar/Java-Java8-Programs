package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection v=new ArrayList();
        v.add(3);
        v.add(5);
        v.add(8);

        Iterator it=v.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
