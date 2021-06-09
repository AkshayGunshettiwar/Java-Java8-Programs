package Java_Java8_Programs.Multithreading;

public class GetSetThread {
    public static void main(String[] args) {
        Thread t1=new Thread( ()->
        {
            for (int i=0; i<=4; i++){
                System.out.println("Hi");
                try { Thread.sleep(500);}catch (Exception e){}
            }
        },  "Hi Thread");                       //setting thread name
        Thread t2=new Thread( ()->
        {
            for (int i=0; i<=4; i++){
                System.out.println("Hello");
                try { Thread.sleep(500);}catch (Exception e){}
            }
        }, "Hello Thread");                     //setting thread name


        //working on an application we have multiple threads and we don't know which thread is doing what.
        //so its better name a thread to recognize the thread and use it later.

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
