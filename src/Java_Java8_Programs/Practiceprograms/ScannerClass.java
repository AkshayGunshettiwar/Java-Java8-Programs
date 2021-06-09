package Java_Java8_Programs.Practiceprograms;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Java marks:");
        int m1=sc.nextInt();
        System.out.println("Enter PHP marks:");
        int m2=sc.nextInt();
        System.out.println("Enter HTML marks:");
        int m3=sc.nextInt();
        System.out.println("Enter .NET marks:");
        int m4=sc.nextInt();
        System.out.println("Enter Python marks:");
        int m5=sc.nextInt();

        float per=(m1+m2+m3+m4+m5)*100/500;
        System.out.println("Percentage:"+per +"%");

    }
}
