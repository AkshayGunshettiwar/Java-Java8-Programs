package Java_Java8_Programs.Multithreading;

//Runnable interface using lambda expression and anonymous class
public class RunnableEx1UsingLambda {
    public static void main(String[] args) {
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
    }
}
