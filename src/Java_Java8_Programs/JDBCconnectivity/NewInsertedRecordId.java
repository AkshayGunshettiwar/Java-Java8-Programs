package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;
import java.util.Scanner;

public class NewInsertedRecordId {
    Connection con=null;
    Statement stmt=null;
    java.sql.PreparedStatement pst=null;

    public void PreparedStmt() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Akshay@123");
        stmt= con.createStatement();
    }
    public String insertData(int id, String name,String city) throws SQLException{
        // stmt.execute("create table if not exists demo(id int,name varchar(50),city varchar(50))");
        stmt.executeUpdate("Insert into demo1(id,name,age) values(1,'sahil',17)" ,Statement.RETURN_GENERATED_KEYS);

        pst=con.prepareStatement("insert into demo values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,city);
        pst.executeUpdate();

        ResultSet rs=pst.getGeneratedKeys();
        int generatedkey=0;
        if(rs.next()){
            generatedkey=rs.getInt(1);
        }
        System.out.println("Inserted Record's ID:"+generatedkey);

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

        NewInsertedRecordId p=new NewInsertedRecordId();
        String status=p.insertData(id,name,city);
        System.out.println("->"+status);
    }



}
