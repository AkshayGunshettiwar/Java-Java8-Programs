package Java_Java8_Programs.Practiceprograms;

public class Palindrome {
    public static void main(String[] args) {
        int num=141;
        int reminder, sum=0, temp;

        temp=num;
        while (num>0) {
            reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;
        }

        if(temp==sum)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
        }
    }

