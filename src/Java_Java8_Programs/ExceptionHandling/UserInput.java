package Java_Java8_Programs.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Enter a number");

        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            br.close();    //br is a resource..anything that comes with IO is a resource. so after using a resource we have close
                           //because it is occupying some memory.so once we done with our job we should be closing the resources.
        }
        System.out.println(n);
    }
}
