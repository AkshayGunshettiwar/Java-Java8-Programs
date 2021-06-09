//This example converts the above program into method that accepts bifunction and function as argument and chains it
//together

package Java_Java8_Programs.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionEx {
    public static void main(String[] args) {

        String res=powToString(2,4,
            (a,b)-> Math.pow(a,b),
            (r)-> "Result :" +String.valueOf(r));

        System.out.println(res);
    }

    public static <R> R powToString(Integer a, Integer b,
                                    BiFunction<Integer,Integer,Double> func,
                                    Function<Double,R> func2){
        return func.andThen(func2).apply(a,b);
    }

}
