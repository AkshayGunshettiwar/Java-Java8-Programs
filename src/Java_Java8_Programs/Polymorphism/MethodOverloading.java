package Java_Java8_Programs.Polymorphism;

public class MethodOverloading {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
class TestOverloading{
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.add(12,34));
        System.out.println(m.add(22.5,22.5));
    }
}
