package Java_Java8_Programs.Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeData {

    void show() {
        List<Employee> list = new ArrayList();

        for (int i=0; i<2; i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the employee id:");
            int id= sc.nextInt();
            System.out.println("Enter the employee name:");
            String name= sc.next();
            System.out.println("Enter the employee city:");
            String city= sc.next();
            Employee e1=new Employee(id,name,city);
            list.add(e1);
        }
          System.out.println("Employee Data:" +list);
    }

    public static void main(String[] args) {
        EmployeeData e=new EmployeeData();
        e.show();
    }
}
 class Employee{
    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", city='" + city + '\'' +
                 '}';
     }
 }
