//Typecasting:-process that converts a data type into another data type manually and automatically.
//a)Implicit:widening type casting:- converting lower data type into higher one
//byte-short-char-int-long-float-double
//b)Explicit:Narrowing type casting:- converting higher data type into lower one
//double-float-long-int-char-short-byte

//int-Integer           (right side wrapper classes)
//        long-Long
//        float-Float
//        double-Double


package Java_Java8_Programs.TypeCasting;

public class Example1 {
    public static void main(String[] args) {
        int a=100;
        System.out.println(""+a);

        double d=a;  //widen the data
        System.out.println(""+d);

        double d1=100.55;
        System.out.println(""+d1);

        int a1=(int) d1;   //narrowing the data
        System.out.println(""+a1);

        String s="1234";
        Integer i=Integer.parseInt(s);
        System.out.println(""+i);
    }
}
