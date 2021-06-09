package Java_Java8_Programs.Inheritance;

public class HierarchicalInheritance {

    public void car(){
        System.out.println("I bought a car");
    }
}
class Color extends HierarchicalInheritance{
    public void Black(){
        System.out.println("I bought a black car");
    }
}
class Seater extends HierarchicalInheritance{
    public void Four(){
        System.out.println("I bought a four seater car");
    }

    public static void main(String[] args) {
        Seater s=new Seater();
        Color c=new Color();
        s.Four();
        s.car();
        c.Black();
    }
}
