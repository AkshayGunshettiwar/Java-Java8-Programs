package Java_Java8_Programs.Multithreading;

public class JoinANDisAlive {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread( ()->
        {
            for (int i=0; i<=4; i++){
                System.out.println("Hi");
                try { Thread.sleep(500);}catch (Exception e){}
            }
        });
        Thread t2=new Thread( ()->
        {
            for (int i=0; i<=4; i++){
                System.out.println("Hello");
                try { Thread.sleep(500);}catch (Exception e){}
            }
        });

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();

        //System.out.println(t1.isAlive());   //true

        t1.join();

        System.out.println(t1.isAlive());      //false

        System.out.println("Bye");
    }
}
