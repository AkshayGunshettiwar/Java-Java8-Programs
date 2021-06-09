package Java_Java8_Programs;

public class StringFunction {

    public static void main(String[] args) {

            //CONCATENATION
            String s="Akshay";
            s=s.concat(" Gunshettiwar");
            System.out.println(s);

            //EQUALS
            String s1="Akshay";
            String s2="AKSHAY";
            String s3="Akshay";
            String s4="Sachin";
            System.out.println(s1.equals(s2));

            //EqualsIgnoreCase
            System.out.println(s1.equalsIgnoreCase(s2));

            //Compare
            System.out.println(s1==s3);

            //CompareTo
            System.out.println(s1.compareTo(s3));
            System.out.println(s1.compareTo(s4));

            //Substring
            String s5=new String("Full Stack Development");
            System.out.println(s5.substring(10));
            System.out.println(s5.substring(2,9));

            //Uppercase & Lowercase
            System.out.println(s3.toUpperCase());
            System.out.println(s2.toLowerCase());

            //Trim
            String s6="  Lenovo";
            System.out.println(s6.trim());

            //length
            String s7="Gunshettiwar";
            System.out.println(s7.length());

            //replace
            String s8="polymorphism means many forms and it occurs when we have many classes that are related to each other by inheritance.";
            String s9=s8.replace("many","any");
            System.out.println(s9);
        }
    }

