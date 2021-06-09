package Java_Java8_Programs.PatternPrograms;

public class NumberTriangle {
    public static void main(String[] args) {
        int a=1;

        for(int i=0;i<4;i++)
        {
            for(int j=4-i; j>1; j--)
            {
                System.out.print("  ");
            }

            for(int j=0; j<=i; j++)
            {
                System.out.print(a++ +"   ");
            }

            System.out.println("  ");
        }
    }
}
