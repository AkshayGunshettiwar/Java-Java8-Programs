package Java_Java8_Programs.Multithreading;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {              //in this method we have the code which we want to execute on concurrent thread.
                                     // run method establishes an entry point to a new thread.
                                      //This interface contains single abstract method, run() with no argument.
                                     //when an object of the class implementing this interface used to create a thread,
                                      //then run method has invoked in a thread that executes separately.

        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        RunnableInterface r=new RunnableInterface();
        Thread t1=new Thread(r);
        t1.start();
        System.out.println("Hello");
    }
}
