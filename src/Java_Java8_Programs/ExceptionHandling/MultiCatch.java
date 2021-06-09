package Java_Java8_Programs.ExceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a[]=new int[4];
            a[5]=30/0;

        }catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception occurs");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }catch (Exception e){
            System.out.println("Parent exception occurs ");
        }
        System.out.println("code executed");
    }
}
