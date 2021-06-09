//package FullStackPrograms.MethodReference;
//
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//interface myInterface{
//    Student getStudent(int id, String name, String city);
//}
//public class MR4 {
//    public static void main(String[] args) {
//        myInterface m=Student::new; //constructor reference
//
//        Function<String,Student> f1=Student::new;
//        BiFunction<String,Student> f2=(name)-> new Student(name);
//
//        System.out.println(m.getStudent(1,"ak","pune").getId());
//        System.out.println(f1.apply(2,"xyz","abc").getId());
//        System.out.println(f2.apply(3,"cvb","sdd").getId());
//    }
//}
//
//class Student{
//    private int id;
//    private String name;
//    private String city;
//
//    public Student(int id, String name, String city) {
//        this.id=id;
//        this.name=name;
//        this.city=city;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//}
//
//
//
//
//
