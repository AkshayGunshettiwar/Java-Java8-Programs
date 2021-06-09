package Java_Java8_Programs.Inheritance;

public class Multilevel {
    public void car(){
        System.out.println("vehicle");
    }

    public void Type(){
        System.out.println("Four wheeler");
    }
}
class Maruti extends Multilevel{
    public void speed(){
        System.out.println("90kmph");
    }
}
class Look extends Maruti{
    public void color(){
        System.out.println("Red");
    }

    public static void main(String[] args) {
        Look l=new Look();
        l.car();
        l.Type();
        l.speed();
        l.color();
    }
}