package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;

public class MysqlCon {

        Connection con= null;
        Statement stmt =null;

        void method() throws SQLException, SQLException {

            stmt.executeUpdate("Insert into Persons(id,name,age) values(1,'sahil',17)");
           // stmt.executeUpdate("update Persons set name='Akshay' where id=1");
            //stmt.executeUpdate("delete from Persons where id=1");
            ResultSet rs=stmt.executeQuery("Select * from Persons");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

        }
        public MysqlCon() {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","Akshay@123");
                stmt= con.createStatement();

            }catch (Exception e){

                System.out.println(e);
            }finally {

            }
        }

        public static void main(String[] args) throws SQLException {
            MysqlCon m=new MysqlCon();
            m.method();

        }
}
