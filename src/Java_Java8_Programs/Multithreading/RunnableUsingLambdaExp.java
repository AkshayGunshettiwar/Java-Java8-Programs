package Java_Java8_Programs.Multithreading;

public class RunnableUsingLambdaExp {

    public static void main(String[] args) {
         //Implementing runnable using anonymous class
        Runnable Runnable1=new Runnable(){

            @Override
            public void run() {
              System.out.println("Thread name:"+Thread.currentThread().getName());
            }
        };
        Thread Thread1=new Thread(Runnable1);

        //Implementing Runnable using lambda expression

        Runnable Runnable2=()->{
            System.out.println("Thread Name:"+Thread.currentThread().getName());
        };
        Thread Thread2=new Thread(Runnable2);

        //start threads
        Thread1.start();
        Thread2.start();
    }

}
