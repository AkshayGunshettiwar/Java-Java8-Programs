package Java_Java8_Programs.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ch=0;
        System.out.println("enter first number:");
        int num1=sc.nextInt();
        System.out.println("enter second number:");
        int num2=sc.nextInt();

        String ans=null;

        do{
            System.out.println("Enter the choice:");
            ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    int add=num1+num2;
                    System.out.println("Addition:"+add);
                    break;
                case 2:
                    int sub=num1-num2;
                    System.out.println("Subtraction:"+sub);
                    break;
                case 3:
                    int mul=num1*num2;
                    System.out.println("Multiplication:"+mul);
                    break;
                case 4:
                    int div=num1/num2;
                    System.out.println("Division:"+div);
                    break;
                default:
                    System.out.println("Terminated");

            }

            System.out.println("Do you want to continue?:");
            ans=sc.next();
        }while(ans.equals("yes"));

    }
}
