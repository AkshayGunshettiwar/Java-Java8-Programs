package Java_Java8_Programs.Multithreading;

class Counter{
    int count;

    public synchronized void increment(){
        count++; //count=count+1
        //t1 and t2 both are executing simultaneously. both are fetching the value and both are incrementing the value
        //at the same time. both threads are using this method same time. so if t1 is executing this method t2 should wait
        // nd vice versa so we want one method to execute at one time

    }
}
public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();  //asking our main thread to wait to complete its job
        t2.join();   //asking t2 to complete its job

        System.out.println("Count:" + c.count);
    }
}
