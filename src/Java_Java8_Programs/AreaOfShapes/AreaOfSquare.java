package Java_Java8_Programs.AreaOfShapes;

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {

        int area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a:");
        int a=sc.nextInt();
        area=a*a;
        System.out.println("Area of square is:"+area);
    }
}
