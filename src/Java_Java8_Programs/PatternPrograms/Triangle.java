package Java_Java8_Programs.PatternPrograms;

public class Triangle {

        public static void main(String[] args) {
            int i, j, k = 4;

            for (i = 0; i < k; i++) {
                for (j = k - i; j > 1; j--) {
                    System.out.print("  ");

                }
                for (j = 0; j <= i; j++) {
                    System.out.print("  *  ");
                }
                System.out.println("  ");

            }
        }
    }

/*public class Triangle
{
    public static void main(String[] args) {

        int r=4, n=1;

        for (int i=1;i<=r;i++)
        {
            for(int j=1; j<=1; j++)
            {
                System.out.println(n+ "  ");
                ++n;
            }
        }
    }

}*/





