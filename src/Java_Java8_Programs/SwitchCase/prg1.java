import java.util.Scanner;
public class prg1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();


            switch (3) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("sum:" + sum);
                    break;

                case 2:
                    int sub = num1 - num2;
                    System.out.println("sub:" + sub);
                    break;

                case 3:
                    int mul = num1 * num2;
                    System.out.println("mul:" + mul);
                    break;

                case 4:
                    int div = num1 / num2;
                    System.out.println("div:" + div);
                    break;

            }
        }
    }




