package Java_Java8_Programs.Practiceprograms;

import java.util.Scanner;

public class RelationalOpe {
    public static void main(String[] args) {
        int m1, m2, m3;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter physics marks");
        m1=scanner.nextInt();
        System.out.println("Enter chemistry marks");
        m2=scanner.nextInt();
        System.out.println("Enter mathematics marks");
        m3=scanner.nextInt();

        float avg= (float) ((m1+m2+m3)/3.0);
        System.out.println("Average marks:" +avg);

        if (avg>45 && m1>35 && m2>35 && m3>35){
            System.out.println("You are passed!");
        }else {
            System.out.println("you are failed!");
        }
    }
}
