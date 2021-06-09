package Java_Java8_Programs.Interface;

interface Demo{
    public void show();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Demo d=new Demo() {
            @Override
            public void show() {
                System.out.println("In anonymous class");
            }
        };
        d.show();
    }
}
