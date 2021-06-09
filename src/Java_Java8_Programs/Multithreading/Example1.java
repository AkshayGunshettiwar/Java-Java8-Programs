package Java_Java8_Programs.Multithreading;

public class Example1 extends Thread {

    public void run(){
        System.out.println("current thread is called");
        System.out.println("Current thread:"+Thread.currentThread().getName());
    }

}
class Demo{
    public static void main(String[] args) {
        Example1 e=new Example1();
       // e.run();
        e.start();
    }
}
