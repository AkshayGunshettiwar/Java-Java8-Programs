package Java_Java8_Programs.JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlQueries {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","Akshay@123");
            Statement stmt= con.createStatement();
            //stmt.executeUpdate("Insert into Persons(id,name,age) values(1,'sahil',17)");
            //stmt.executeUpdate("delete from Persons where id=1");
            stmt.executeUpdate("update Persons set name='Akshay' where id=1");
            ResultSet rs=stmt.executeQuery("Select * from Persons");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));


        }catch (Exception e){

            System.out.println(e);
        }
    }

}
