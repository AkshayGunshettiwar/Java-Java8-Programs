package Java_Java8_Programs.Practiceprograms;

class Ex{
    public void show(){
        System.out.println("In show method");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Ex e=new Ex(){
            public void show(){
                System.out.println("In anonymous class");              //Anonymous class
            }
        };
        e.show();
    }

}
