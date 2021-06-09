package Java_Java8_Programs.Polymorphism;

public class MethodOverridingEx1 {

    void show(){
        System.out.println("hello");
    }
}

    class Over extends MethodOverridingEx1{
    void show(){
        super.show();
        System.out.println("bye");
    }


    public static void main(String[] args) {
        Over o=new Over();
        o.show();
    }
}
