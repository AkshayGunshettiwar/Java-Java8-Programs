package Java_Java8_Programs.ExceptionHandling;

public class ExceptionTypes {
    public static void main(String[] args) {
        int a=5;
        String s=null;

        try{
            //int res=a/0;                        //Arithmetic exception
            //System.out.println("Result:"+res);

            //System.out.println(s.length());       //NullPointerException
            int b[]=new int[5];

            System.out.println(b[10]=50);            //ArrayIndexOutOfBoundsException
           }catch (Exception e){
            System.out.println(e);
        }
    }
}
