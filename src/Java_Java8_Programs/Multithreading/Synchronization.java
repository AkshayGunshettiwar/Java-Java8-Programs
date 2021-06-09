package Java_Java8_Programs.Multithreading;

public class Synchronization {
    public synchronized void display() throws InterruptedException {
        for(int i=0; i<=5; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
class Thread1 extends Thread{
    Synchronization syn;

    public Thread1(Synchronization syn){
        this.syn=syn;
    }
    public void run(){
        try {
            syn.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread{
    Synchronization syn;

    public Thread2(Synchronization syn){
        this.syn=syn;
    }
    public void run(){
        try {
            syn.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Mainthread{
    public static void main(String[] args) {
        Synchronization s=new Synchronization();
        Thread1 m1=new Thread1(s);
        Thread2 m2=new Thread2(s);
        m1.start();
        m2.start();
    }
}
