//Demo for JDBC inplementation

package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class jdbcImplementation {
    public static void main(String[] args) {

        try {
            //Step 1:Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            //Step2:Create Connection
            String url = "jdbc:mysql://localhost:3306/secr";
            String user="root";
            String pass="";

            Connection con= DriverManager.getConnection(url,user,pass);

            //step3:Statement prepare
            Statement stmt=con.createStatement();
            String sql="Insert into info Values(12,'disha','dish@12gmail.com')";

            //Step4:Execute Statement.
            int rows=stmt.executeUpdate(sql);
            System.out.println("no of rows affected: "+rows);
            
        } catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}



