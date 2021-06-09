package Java_Java8_Programs.Collections;

import java.util.ArrayList;
import java.util.List;

public class DataSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Akshay");
        list.add("yash");
        list.add("dhanshree");
        list.add("anand");

        list.remove("anand");
        System.out.println("List"+list);
    }
}
