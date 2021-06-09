package Java_Java8_Programs.Package1;

public class Class1 {
    private int a=10;
    protected int b=20;
    int c=30;
    public int d=40;

    public static void main(String[] args) {
        Class1 c=new Class1();
        System.out.println("Same class private var:"+c.a);
        System.out.println("Same class protected var:"+c.b);
        System.out.println("Same class default var:"+c.c);
        System.out.println("Same class public var:"+c.d);

    }
}
