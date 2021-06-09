package Java_Java8_Programs.Practiceprograms;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        list1.add("A,B,C,D");

        List<String> list2=new ArrayList<String>();
        list2.add("P,Q,R,S");

        List<String> join=new ArrayList<String>();

        join.addAll(list1);
        join.addAll(list2);

        System.out.println("List 1:"+list1);
        System.out.println("List 2:"+list2);
        System.out.println("List Joined:"+join);
    }
}
