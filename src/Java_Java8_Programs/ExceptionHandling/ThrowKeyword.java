package Java_Java8_Programs.ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter no:");
            int n=sc.nextInt();
            if (n<18){
                throw new ArithmeticException("Not valid");
            }else {
                System.out.println("valid to vote");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
