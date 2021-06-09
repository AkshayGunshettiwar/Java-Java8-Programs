package Java_Java8_Programs.TypeCasting;

public class ExplicitType {
    public static void main(String[] args) {
        double d=7.55;
        long l=(long)d;
        int i=(int)l;

        System.out.println("Before converting, double value:"+d);
        System.out.println("After converting, long value:"+l);
        System.out.println("Before converting, int value:"+i);
    }
}
