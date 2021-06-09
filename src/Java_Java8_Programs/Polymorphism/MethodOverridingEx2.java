package Java_Java8_Programs.Polymorphism;

public class MethodOverridingEx2 {


    int rate() {
        return 10;
    }
}

    class bank1 extends MethodOverridingEx2{
        int rate(){
            super.rate();
            return 4;
        }
    }

    class bank2 extends MethodOverridingEx2{
        int rate(){
            super.rate();
            return 5;
        }

        public static void main(String[] args) {
            MethodOverridingEx2 m=new MethodOverridingEx2();
            System.out.println("Rate 1:"+m.rate());
            bank1 b1=new bank1();
            System.out.println("Rate 2:"+b1.rate());
            bank2 b2=new bank2();
            System.out.println("Rate 3:"+b2.rate());

        }
    }


