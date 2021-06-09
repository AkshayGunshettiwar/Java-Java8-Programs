package Java_Java8_Programs.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//in version 1.7....its not necessary to write finally block. so we can define our object in try itself.
//so as soon as our resource goes out of scope..the resource will close automatically


public class TryWithResource {
    public static void main(String[] args) throws IOException {
        int n=0;
        System.out.println("Enter a number:");

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            n=Integer.parseInt(br.readLine());
        }
        System.out.println(n);
    }
}
