package Java_Java8_Programs.Constructors;

import java.util.Scanner;

public class ThisKeyword {

    int num1;
    int num2;
    public ThisKeyword(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    int add(){
        int add=num1+num2;
        System.out.println("Addition:"+add);
        return add;
    }

    int sub(){
        int sub=num1-num2;
        System.out.println("Subtraction:"+sub);
        return sub;
    }

    void mul(){
        int a=add();
        int b=sub();
        int result1=a*10;
        int result2=b*10;
        System.out.println("Result 1:"+result1);
        System.out.println("Result 2:"+result2);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for num1:");
        int num1= sc.nextInt();
        System.out.println("Enter value for num2:");
        int num2= sc.nextInt();

        ThisKeyword t=new ThisKeyword(num1,num2);
        t.mul();

    }
}
