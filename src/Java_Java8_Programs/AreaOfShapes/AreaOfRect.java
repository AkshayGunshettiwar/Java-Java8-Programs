package Java_Java8_Programs.AreaOfShapes;

import java.util.Scanner;

public class AreaOfRect {

    public static void main(String[] args) {

        int area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for l");
        int l=sc.nextInt();

        System.out.println("Enter the value for b");
        int b=sc.nextInt();

        area=l*b;
        System.out.println("Area:"+area);
    }
}
