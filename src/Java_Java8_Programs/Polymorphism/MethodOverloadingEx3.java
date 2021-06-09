package Java_Java8_Programs.Polymorphism;

public class MethodOverloadingEx3 {

    public void multiply(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication:"+mul);
    }

    public void multiply(int c, int d, int e){
        int mul=c*d*e;
        System.out.println("Multiplication:"+mul);
    }

    public static void main(String[] args) {
        MethodOverloadingEx3 e=new MethodOverloadingEx3();
        e.multiply(1,5);
        e.multiply(2,2,2);
    }
}
