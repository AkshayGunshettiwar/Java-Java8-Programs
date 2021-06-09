package Java_Java8_Programs.Abstraction;

abstract class abstraction{
    void Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void GearChanged(){
        System.out.println("gear changed");
    }
}
class yamaha extends abstraction{

    @Override
    void run() {
        System.out.println("bike is running...");
    }
}
class Test{
    public static void main(String[] args) {
        abstraction a=new yamaha();
        a.Bike();
        a.run();
        a.GearChanged();
    }
}

