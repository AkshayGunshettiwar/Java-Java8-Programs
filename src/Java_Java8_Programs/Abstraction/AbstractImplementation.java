package Java_Java8_Programs.Abstraction;

public abstract class AbstractImplementation {

        abstract void getdata();

        public void display()
        {
            System.out.println("In display method");
        }
    }

    abstract class ImpAbstract1 extends AbstractImplementation{
        abstract void display1();
    }
    class ImpAbstract extends ImpAbstract1{


        @Override
        void getdata() {
            System.out.println("In getdata method");
        }

        @Override   //annotation
        void display1() {
            System.out.println("In display1 method");

        }
        void checkData(){
            System.out.println("In checkData method");
        }

        public static void main(String[] args) {
            ImpAbstract i=new ImpAbstract();
            i.display();
            i.getdata();
            i.checkData();
            i.display1();
        }


    }


