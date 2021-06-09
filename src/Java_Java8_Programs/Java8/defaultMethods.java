package Java_Java8_Programs.Java8;

interface Phone{
    void call();    //abstract method
    default void message(){
        System.out.println("sent");    //In java 8 we can have concrete methods. By using default methods
    }
}
class Android implements Phone{

    @Override
    public void call() {
        System.out.println("calling");
    }
}

public class defaultMethods {
    public static void main(String[] args) {
        Android a=new Android();
        a.call();
        a.message();

    }
}
