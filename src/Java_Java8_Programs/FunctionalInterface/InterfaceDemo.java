package Java_Java8_Programs.FunctionalInterface;

interface Abc{
    public void show();
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Abc obj=() -> System.out.println(" Using Functional Interface");
        obj.show();
    }
}



