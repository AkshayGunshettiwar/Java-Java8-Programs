package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;

public class Trigger {
    Connection con=null;
    Statement stmt=null;

    void method() throws SQLException {
        ResultSet rs=stmt.executeQuery("Select * from dept_audit");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));
    }
    public Trigger(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","Akshay@123");
            stmt= con.createStatement();

        }catch (Exception e){

            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        Trigger m=new Trigger();
        m.method();

    }
}
