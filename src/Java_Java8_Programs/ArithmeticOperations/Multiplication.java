package Java_Java8_Programs.ArithmeticOperations;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a:");
        //int a=sc.nextInt();
        float a=sc.nextFloat();

        System.out.println("Enter the value for b:");
        //int b=sc.nextInt();
        float b=sc.nextFloat();

        // int multiplication=a*b;
        float multiplication=a*b;

        System.out.println("Multiplication:"+multiplication);

    }

}
