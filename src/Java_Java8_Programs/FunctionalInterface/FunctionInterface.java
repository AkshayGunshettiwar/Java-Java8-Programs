package Java_Java8_Programs.FunctionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        FunctionInterface f=new FunctionInterface();
        List<String> list= Arrays.asList("java","python","php","html");

        //using lambda expression
        Map<String,Integer> map=f.convertListToMap(list,x->x.length());
        System.out.println(map);

        //using method reference
        Map<String,Integer> map2=f.convertListToMap(list,f::getLength);
        System.out.println(map2);

    }

    public <T,R>Map<T,R> convertListToMap(List<T> list, Function<T,R> func){

        Map<T,R> res=new HashMap<>();
        for(T t:list){
            res.put(t,func.apply(t));
        }
        return res;

    }
    public Integer getLength(String str){
        return str.length();
    }
}
