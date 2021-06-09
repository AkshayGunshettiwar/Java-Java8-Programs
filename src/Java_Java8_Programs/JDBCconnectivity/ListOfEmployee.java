package Java_Java8_Programs.JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfEmployee {

    Connection con=null;
    Statement stmt=null;
    java.sql.PreparedStatement pst=null;

    public ListOfEmployee() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Akshay@123");
        stmt=con.createStatement();
    }

    void insertData() throws SQLException {
        Scanner sc=new Scanner(System.in);
        List<Employee> list=new ArrayList();
        System.out.println("Enter the no of employees");
        int n= sc.nextInt();

        for (int i=0; i<n ; i++){
            System.out.println("Enter id");
            int id=sc.nextInt();
            System.out.println("Enter name");
            String name=sc.next();
            System.out.println("Enter city");
            String city=sc.next();

            Employee e=new Employee(id,name,city);
            list.add(e);

            pst=con.prepareStatement("insert into demo values(?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, city);
            pst.executeUpdate();
            System.out.println("Data inserted successfully");
        }
        System.out.println("List:"+list);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ListOfEmployee l=new ListOfEmployee();
        l.insertData();
    }
}

class Employee{
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city){
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