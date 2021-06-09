//The method name in subclass has same name as that of method name in parent class.

package Java_Java8_Programs.Polymorphism;

public class MethodOverloadingEx1 {

    public void CalArea(int radius){
        double circleArea=3.14*radius*radius;
        System.out.println("Area of circle:"+circleArea);
    }

    public void CalArea(int l, int b){
        double rectArea=l*b;
        System.out.println("Area of circle:"+rectArea);
    }

    public static void main(String[] args) {
        MethodOverloadingEx1 m=new MethodOverloadingEx1();
        m.CalArea(5);
        m.CalArea(5,10);
    }
}
