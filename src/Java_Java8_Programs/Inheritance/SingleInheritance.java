package Java_Java8_Programs.Inheritance;

public class SingleInheritance {
    public void run(){
        System.out.println("In run method");
    }
}
class Dog extends SingleInheritance{
    public void bark(){
        System.out.println("In Bark method");
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.run();
    }
}