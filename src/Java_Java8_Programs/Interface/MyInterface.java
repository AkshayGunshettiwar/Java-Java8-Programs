package Java_Java8_Programs.Interface;

public interface MyInterface {
    void withdraw();
    void deposit();
}

interface MyInterface1{
    void display();
}

interface MyInterface2 extends MyInterface,MyInterface1{
    void display1();
}

class SBI implements MyInterface2{

    @Override
    public void withdraw() {
        System.out.println("In withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit");

    }

    @Override
    public void display() {
           System.out.println("In display");
    }

    @Override
    public void display1() {
        System.out.println("In display1");
    }
    public static void main(String[] args) {
        SBI s=new SBI();
        s.deposit();
        s.withdraw();
        s.display();
        s.display1();
    }
}