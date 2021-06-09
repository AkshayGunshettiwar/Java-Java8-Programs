package Java_Java8_Programs.MethodReference;

//Reference to instance method of arbitrary object of particular type

import java.util.Arrays;

public class MethodRef3 {

    public static void main(String[] args) {
        String[] strArr = {"Abhishek", "Shahrukh", "Salmaan", "Aamir", "Akshay"};
        Arrays.sort(strArr, String::compareToIgnoreCase);
        for (String str : strArr) {
            System.out.println(str);
        }


        String[] strArray = {"Abhishek", "Shahrukh", "Salmaan", "Aamir", "Akshay"};
        Arrays.sort(strArray, String::compareTo);

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArray[i]);
        }

        String[] strAr={"A","B","C","D","E"};
        Arrays.sort(strArr,(s1,s2)->s1.compareToIgnoreCase(s2));

        Arrays.sort(strArr,String::compareToIgnoreCase);


    }
}

