package Java_Java8_Programs.PatternPrograms;

public class ReverseTriangle {

        public static void main(String[] args) {

            for(int i=7; i>=1; --i)
            {
                for(int j=1; j<=7-i; ++j)
                {
                    System.out.print("  ");
                }

                for(int j=0; j<i-1; ++j)
                {
                    System.out.print(" * ");
                }

                System.out.println("  ");
            }
        }
    }

