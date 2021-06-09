package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;

public class StoredProcedure {
    Connection con= null;
    CallableStatement stmt =null;

    void method() throws SQLException {
        stmt=con.prepareCall("{call get_data1()}");
        stmt.execute();
        ResultSet rs=stmt.getResultSet();
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    }
    public StoredProcedure() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Akshay@123");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        StoredProcedure p=new StoredProcedure();
        p.method();
    }
}
