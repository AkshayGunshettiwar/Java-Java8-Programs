package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;
import java.util.Scanner;

public class InsertionUsingConstructor {

    Connection con=null;
    Statement stmt=null;
    java.sql.PreparedStatement pst=null;

    public InsertionUsingConstructor() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Akshay@123");
        stmt= con.createStatement();

    }
    public String insertData(int id, String name,String city) throws SQLException{
        stmt.execute("create table if not exists information(id int,name varchar(50),city varchar(50))");

        pst=con.prepareStatement("insert into information values(?,?,?)");
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,city);
        pst.execute();
        return "data inserted successfully";

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details:");
        System.out.println("Enter id:");
        int id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter city");
        String city=sc.next();

        InsertionUsingConstructor p=new InsertionUsingConstructor();
        String status=p.insertData(id,name,city);
        System.out.println("->"+status);
    }
}
