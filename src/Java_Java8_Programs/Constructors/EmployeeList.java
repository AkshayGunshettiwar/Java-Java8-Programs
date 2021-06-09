//Parameterized constructor
//it has specific number of parameters
package Java_Java8_Programs.Constructors;
import java.util.Scanner;

public class EmployeeList {

    int id;
    String name;
    int age;
    float salary;
    String post;

    public EmployeeList(int id, String name, int age, float salary, String post){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.post=post;
    }

    void EmployeeData(){
        System.out.println("Employee id is:"+id);
        System.out.println("Employee name is:"+name);
        System.out.println("Employee age is:"+age);
        System.out.println("Employee salary is:"+salary);
        System.out.println("Employee post is:"+post);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id:");
        int id=sc.nextInt();
        System.out.println("Enter the Name:");
        String name=sc.next();
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        System.out.println("Enter the salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the post:");
        String post=sc.next();

        EmployeeList e1=new EmployeeList(id,name,age,salary,post);
        e1.EmployeeData();

    }
}
