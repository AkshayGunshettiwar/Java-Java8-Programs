package Java_Java8_Programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int i,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n=sc.nextInt();

        for (i=2;i<n;i++){
            a=n%2;
            if(a==0){
                System.out.println("Not a prime number");
                break;
            }else{
                System.out.println("Is a prime number");
                break;
            }
        }
    }
}
