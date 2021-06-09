package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;

public class PrimaryForeignkey {
    Statement st=null;
    public PrimaryForeignkey(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysystem","root", "Akshay@123");
            st=con.createStatement();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }

    public void display() throws SQLException {
        try {
            ResultSet rs = st.executeQuery("select emp.id, emp.name, emp.city, dept.name from employee emp, department dept where emp.id=dept.id");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        PrimaryForeignkey p=new PrimaryForeignkey();
        p.display();
    }

}
