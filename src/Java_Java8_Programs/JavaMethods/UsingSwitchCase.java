package Java_Java8_Programs.JavaMethods;

import java.util.Scanner;

public class UsingSwitchCase {

    public void add(int num1, int num2){
        int add=num1+num2;
        System.out.println("Addition is:"+add);
    }
    public void sub(int num1, int num2){
        int sub=num1-num2;
        System.out.println("Subtraction is:"+sub);
    }
    public void mul(int num1, int num2){
        int mul=num1*num2;
        System.out.println("Multiplication is:"+mul);
    }
    public void div(int num1, int num2){
        int div=num1/num2;
        System.out.println("Division is:"+div);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for num1:");
        int num1= sc.nextInt();
        System.out.println("Enter value for num2:");
        int num2= sc.nextInt();

        switch (2) {

            case 1:
                UsingSwitchCase u=new UsingSwitchCase();
                u.add(num1,num2);
                break;

            case 2:
                UsingSwitchCase u1=new UsingSwitchCase();
                u1.sub(num1,num2);
                break;

            case 3:
                UsingSwitchCase u2=new UsingSwitchCase();
                u2.mul(num1,num2);
                break;

            case 4:
                UsingSwitchCase u3=new UsingSwitchCase();
                u3.div(num1,num2);
                break;
        }

    }
}
