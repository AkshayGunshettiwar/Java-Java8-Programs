package Java_Java8_Programs.Interface;

interface StaticMethod {
    void sbc();
    static void display(){
        System.out.println("static method in interface");
    }
}
class Test{
    public static void main(String[] args) {
        StaticMethod.display();
    }
}
