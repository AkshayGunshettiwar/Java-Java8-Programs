package Java_Java8_Programs.JDBCconnectivity;

import java.sql.*;

public class INkeyword {

    Statement st=null;
    public INkeyword() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Akshay@123");
            st = con.createStatement();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void display(){
        try{
            ResultSet rs=st.executeQuery("select * from information where city IN('pune') ");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        INkeyword n=new INkeyword();
        n.display();
    }
}
