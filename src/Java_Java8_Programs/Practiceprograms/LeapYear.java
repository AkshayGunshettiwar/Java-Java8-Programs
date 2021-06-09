package Java_Java8_Programs.Practiceprograms;

public class LeapYear {
    public static void main(String[] args) {
        int year=1990;
        boolean leap=false;

        //if the year is divided by four
        if (year%4==0){

            //if year is a century
            if (year % 100==0){
                //if year is divided by 400 then its a leap year
                if (year%400==0)
                    leap=true;
                else
                    leap=false;
            }
            else
                leap=true;

        }else
            leap=false;

        if (leap)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+ " is not a leap year");

    }
}
