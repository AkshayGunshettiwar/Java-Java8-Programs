package Java_Java8_Programs;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String str[]=new String[10];

        // str[5]="codekul";            //If value is present setting value for fifth index

        Optional<String> checkNull=Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            Integer Strlength=str[5].length();
            System.out.println(Strlength);

        }else {
            System.out.println("String value is not present");
        }
    }
}
