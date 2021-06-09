package Java_Java8_Programs.Practiceprograms;


class Outer{
    int a;
    public void show(){
        System.out.println("in outer class");
    }

    class Inner{
        public void display(){
            System.out.println("in inner class");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {

        Outer obj=new Outer();
        obj.show();

        //accessing inner class method
        Outer.Inner obj1=obj.new Inner();
        obj1.display();
    }
}
