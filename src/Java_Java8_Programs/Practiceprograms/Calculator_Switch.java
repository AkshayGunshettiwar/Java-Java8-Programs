package Java_Java8_Programs.Practiceprograms;

import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        System.out.println("Enter an operator(+,-,*,/):");
        char operator=sc.next().charAt(0);
        int result=0;

        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Error");
                return;
        }
        System.out.println(num1 + " "+ operator + " " + num2 + "=" + result);
    }
}
