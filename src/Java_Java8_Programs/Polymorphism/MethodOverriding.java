package Java_Java8_Programs.Polymorphism;

public class MethodOverriding {
    void show(){
        System.out.println("parent class method");
    }
}
class child extends MethodOverriding{
    void show(){
        super.show();
        System.out.println("child class method");
    }
}
class Main{
    public static void main(String[] args) {
        child c=new child();
        c.show();
    }
}
