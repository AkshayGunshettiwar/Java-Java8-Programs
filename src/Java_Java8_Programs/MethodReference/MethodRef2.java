package Java_Java8_Programs.MethodReference;

//Reference to instance method of particular object

import java.util.Arrays;
import java.util.List;

public class MethodRef2 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Reference r=new Reference();
        list.forEach(r::show);
    }
}
class Reference{
    public void show(Integer i){
        System.out.println(i);
    }
}