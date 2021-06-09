package Java_Java8_Programs.Interface;

public interface Example1 {

        void m1();
    }

    class c1 implements Example1{

        @Override
        public void m1() {
            System.out.println("In m1");
        }

        public static void main(String[] args) {
            Example1 c=new c1();
            c.m1();
        }
    }

//Interface is a blueprint of class and it can have static and abstract methods
//it is used to achieve abstraction. Interface can have only abstract method not method body.

