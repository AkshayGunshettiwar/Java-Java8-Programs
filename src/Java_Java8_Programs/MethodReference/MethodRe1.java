package Java_Java8_Programs.MethodReference;

import java.util.function.BinaryOperator;

public class MethodRe1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> Bi=Multiply::multiply;
        Integer product=Bi.apply(10,20);
        System.out.println("Product is:"+product);
    }
}
class Multiply{
    static int multiply(int a, int b){
        return a*b;
    }
}
