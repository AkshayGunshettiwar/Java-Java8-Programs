package Java_Java8_Programs.Multithreading;


class Hi extends Thread{
    public void run() {
        for (int i=0; i<=5; i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
class Hello extends Thread{
    public void run() {
        for (int i=0; i<=5; i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello h=new Hello();

        hi.start();
        try{Thread.sleep(10);}catch (Exception e){}
        h.start();


    }
}
