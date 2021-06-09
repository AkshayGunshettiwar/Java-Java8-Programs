package Java_Java8_Programs.Inheritance;

public class MultilevelInheritance {

    public void show(){

        System.out.println("Hello");
    }
}
class Human extends MultilevelInheritance{
         public void child(){
             System.out.println("Child cries");
         }
}
class Behaviour extends Human{
    public void moody(){
        System.out.println("moody");
    }

    public static void main(String[] args) {
        Behaviour b=new Behaviour();
        b.moody();
        b.child();
        b.show();
    }
}