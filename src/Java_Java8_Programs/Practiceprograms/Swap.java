package Java_Java8_Programs.Practiceprograms;

public class Swap {
    public static void main(String[] args) {
        int a=20, b=40;

        System.out.println("a before swap:"+a);
        System.out.println("b before swap:"+b);

        int temp=a;   //value of a is assigned to temp
        a=b;          //value of b is assigned to a
        b=temp;        //value of temp is assgined to b

        System.out.println("a after swap:"+a);
        System.out.println("b after swap:"+b);
    }
}
