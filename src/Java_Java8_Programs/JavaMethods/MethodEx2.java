package Java_Java8_Programs.JavaMethods;

import java.util.Scanner;

public class MethodEx2 {

    public int add(int num1, int num2){
        int add=num1+num2;
        System.out.println("Addition is:"+add);
        return add;
    }

    public void multiply(int num1, int num2)
    {
        int x=add(num1,num2);
        int res=x*10;
        System.out.println("Result is:"+res);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();

        System.out.println("Enter num2:");
        int num2=sc.nextInt();

        MethodEx2 m=new MethodEx2();
        m.multiply(num1,num2);

    }
}

