package Java_Java8_Programs.Multithreading;


class Demo1 implements Runnable{
    public void run(){
       for (int i=0; i<=4; i++){
           System.out.println("Hi");
           try { Thread.sleep(500);}catch (Exception e){}
       }
    }
}

class Demo2 implements Runnable{
    public void run(){
        for (int i=0; i<=4; i++){
            System.out.println("Hello");
            try { Thread.sleep(500);}catch (Exception e){}
        }
    }
}

public class RunnableEx1 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        Demo2 demo2=new Demo2();

        Thread t1=new Thread(demo1);
        Thread t2=new Thread(demo2);

        t1.start();
        try { Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
