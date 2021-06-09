package Java_Java8_Programs.JavaMethods;

import java.util.Scanner;

public class MethodsEx {

    public void add(int num1, int num2){

        int add=num1+num2;
        System.out.println("addition:"+add);
    }
    public void sub(int num1, int num2){

        int sub=num1-num2;
        System.out.println("subtraction:"+sub);
    }
    public void mul(int num1, int num2){

        int mul=num1*num2;
        System.out.println("multiplication:"+mul);
    }
    public void div(int num1, int num2){

        int div=num1/num2;
        System.out.println("division:"+div);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();

        System.out.println("Enter num2:");
        int num2=sc.nextInt();

        MethodsEx j=new MethodsEx();
          j.add(num1,num2);
          j.sub(num1,num2);
          j.mul(num1,num2);
          j.div(num1,num2);

    }
}

