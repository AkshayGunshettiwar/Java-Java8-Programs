package Java_Java8_Programs.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterface {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> fun=(a, b)->Math.pow(a,b);
        Function<Double,String> fun1= a->"res:"+String.valueOf(a);
        String res=fun.andThen(fun1).apply(2,4);
        System.out.println(res);
    }
}
