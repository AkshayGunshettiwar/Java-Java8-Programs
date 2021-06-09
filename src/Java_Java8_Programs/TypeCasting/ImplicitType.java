package Java_Java8_Programs.TypeCasting;

public class ImplicitType {
    public static void main(String[] args) {
        int x=7;
        long y=x;
        double z=y;

        System.out.println("Before converting, int value:"+x);
        System.out.println("After converting, long value:"+y);
        System.out.println("Before converting, double value:"+z);
    }
}
