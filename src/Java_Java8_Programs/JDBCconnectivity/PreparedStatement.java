package Java_Java8_Programs.JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {
    Connection con= null;
    java.sql.PreparedStatement ps =null;

    void method() throws SQLException {

        java.sql.PreparedStatement ps=con.prepareStatement("insert into Persons values(?,?,?)");
        ps.setInt(1,3);
        ps.setString(2,"xyz");
        ps.setInt(3,21);

        int i=ps.executeUpdate();
        /*  stmt.executeUpdate("Insert into Persons(id,name,age) values(1,'sahil',17)");
        stmt.executeUpdate("update Persons set name='Akshay' where id=1");
        //stmt.executeUpdate("delete from Persons where id=1");*/
        ResultSet rs=ps.executeQuery("Select * from Persons");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

    }
    public PreparedStatement() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","Akshay@123");
            // stmt= con.createStatement();

        }catch (Exception e){

            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        PreparedStatement m=new PreparedStatement();
        m.method();
    }
}
