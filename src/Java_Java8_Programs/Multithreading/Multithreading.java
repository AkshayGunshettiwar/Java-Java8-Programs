package Java_Java8_Programs.Multithreading;

public class Multithreading extends Thread{
        public void run(){
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
            }
        }
        public static void main(String[] args) {
            Multithreading m=new Multithreading();
            // m.run();
            m.start();
            m.start();
            System.out.println("Hiiiiiiiiii");
        }

    }

