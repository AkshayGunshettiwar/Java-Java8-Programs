package Java_Java8_Programs.MethodReference;

interface MyIntF{
    void disp();
}
public class MethodRe2 {
    public void myMethod(){
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        MethodRe2 m=new MethodRe2();
        MyIntF f=m::myMethod;
        f.disp();
    }
}