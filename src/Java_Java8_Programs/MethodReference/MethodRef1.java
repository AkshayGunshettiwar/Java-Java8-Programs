//method reference is a part of java 8 functional interface used to refer the method of functional interface.
//It can be replaced with lambada expression when you are just referring a method.

//Reference to static method of particular object
package Java_Java8_Programs.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRef1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("akshay","anand","yash","dhanshree");
        list.forEach(Demo::Display);
}
}
class Demo{
    static void Display(String str){
        System.out.println(str);
    }
}
