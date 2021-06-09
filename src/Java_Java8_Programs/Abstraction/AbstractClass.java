package Java_Java8_Programs.Abstraction;

abstract class AbstractClass {
    abstract void draw();
}

class Rect extends AbstractClass {

    @Override
    void draw() {
        System.out.println("In draw method");
    }

    static class circle extends Rect {
        void method() {
            System.out.println("In method");
        }
    }
    public static void main(String[] args) {
        circle c=new circle();
        c.method();
        c.draw();
    }
}


//Abstraction is a process of data hiding.abstract class can have abstract and no-abstract methods. it shows essential things to user
//and hides the internal details.

