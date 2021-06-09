package Java_Java8_Programs.Inheritance;

public class single {
    void print(){
        System.out.println("Akshay");
    }
}
class two extends single{
    void print1(){
        System.out.println("Gunshettiwar");
    }
}
class main{
    public static void main(String[] args) {
        two t=new two();
        t.print();
        t.print1();
    }
}




