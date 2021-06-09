package Java_Java8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterData {
    public static void main(String[] args) {

     /* List<String> list= Arrays.asList("India","US","Japan","France","China","Australia");
      List<String> list1= new ArrayList<String>();
      for(int i=0; i<list.size(); i++) {
          if (list.get(i) != "China") {
             list1.add(list.get(i));
          }
      }

      System.out.println("Original Country list: "+list);
      System.out.println("New List:"+list1);*/

        /*List<String> list= Arrays.asList("India","US","Japan","France","China","Australia");
        System.out.println("Original List:" +list);
        List<String> newList=list.stream().filter(str->!"China".equals(str)).collect(Collectors.toList());
        System.out.println("New List:" +newList);*/

       /* List<Integer> list=Arrays.asList(10,5,20,25,30,35);
        System.out.println("Original List:" +list);
        List<Integer> newList=list.stream().filter(x->x>10).collect(Collectors.toList());
        System.out.println("New List:"+newList);*/

        List<Integer> list= Arrays.asList(20,30,24,45,89,30);
        System.out.println("Original List:" +list);
        List<Integer> newList=list.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(("New List:"+newList));

    }
}
