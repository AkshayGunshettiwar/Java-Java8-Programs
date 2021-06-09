package Java_Java8_Programs.PatternPrograms;

public class RightAngledTriangle {

        public static void main(String[] args) {

            for(int i=1;i<=4;i++)
            {
                for(int j=1;j<i+1;j++)
                {
                    System.out.print("  *  ");
                }

                System.out.println("  ");
            }
        }
    }


//INVERTED

/*public class RightAngleTri{
    public static void main(String[] args) {
        for(int i=4;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  *  ");
            }

            System.out.println("  ");
        }
    }
}*/


