package Java_Java8_Programs.Package1.Package2;

import Java_Java8_Programs.Package1.Class1;

public class Class3 extends Class1 {
    public static void main(String[] args) {
        Class3 c=new Class3();
        //System.out.println("outside class diff package private var:"+ c.a);
        System.out.println("outside class diff package protected var:"+ c.b);
       // System.out.println("outside class diff package default var:"+ c.c);
        System.out.println("outside class diff package public var:"+ c.d);

    }

}
