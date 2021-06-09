package Java_Java8_Programs.ExceptionHandling;

public class UserDefinedException {

    public static void main(String[] args) {
        int i=8, j=9;
        try {
            int k=i/j;
            if (k==0)
                throw new AkshayException(" This is not possible!");

            System.out.println(k);
        }
        catch (AkshayException e){
            System.out.println("Error.." + e.getMessage());
        }
    }
}
