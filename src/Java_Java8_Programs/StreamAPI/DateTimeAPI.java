package Java_Java8_Programs.StreamAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        //specify date
        LocalDate ld=LocalDate.of(1999,07,28);
        System.out.println(ld);
        System.out.println("Happy Birthday Akshay");

        //local time
        LocalTime lt=LocalTime.now();
        System.out.println(lt);


    }
}
