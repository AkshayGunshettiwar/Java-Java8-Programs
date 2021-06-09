package Java_Java8_Programs.MethodReference;

//Reference to constructor

interface MyInterface{
        MethodRef4 getString(String s);
        }

public class MethodRef4 {
    public MethodRef4(String s) {
        System.out.print(s);
    }

    public static void main(String[] args) {
        MyInterface r=MethodRef4::new;
        r.getString("Hello");
    }
}

