package Java_Java8_Programs.Polymorphism;

public class MethodOverloadingEx2 {
    public void ford() {
        System.out.println("I bought new car");
    }
}

    class color extends MethodOverloadingEx2{
        public void Black(){
            System.out.println("I bought black car");
        }
    }

    class Seat extends color{
        public void Black(){
            System.out.println("I bought a four seater car");
            super.Black();
        }


    public static void main(String[] args) {
        Seat s=new Seat();
        s.Black();
        s.ford();
    }
}
