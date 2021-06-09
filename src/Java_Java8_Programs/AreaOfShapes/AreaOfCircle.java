package Java_Java8_Programs.AreaOfShapes;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        double pi=3.14;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for r:");
        int r=sc.nextInt();
        area= pi*r*r;

        System.out.println("Area of circle is:"+area);




    }
}
