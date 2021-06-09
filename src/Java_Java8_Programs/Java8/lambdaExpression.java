package Java_Java8_Programs.Java8;


interface A{
    void show(int i);
}
public class lambdaExpression {
    public static void main(String[] args) {
//        A obj= new A() {
//            @Override
//            public void show(int i) {
//                System.out.println("Hello "+i);
//            }
//        };

        A obj= (i)-> System.out.println("Hello " +i);   //implementation of interface A

        //so instead of writing commented code we just write it using lambda expression which is used for code optimization
        obj.show(7);
    }
}
