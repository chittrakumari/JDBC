/*create a database "gla", in that database create a table "student", which contain following columns
        rollno (int),
        name(text),
        email(varchar),
        cpi(float).

        Perform the following queries
        1. Insert  - > INSERT INTO `student` (`rollno`, `name`, `email`, `cpi`) VALUES ('12', 'Vaibhav', 'vai@gmail.com', '5.73');
        2. update where rollno is 12 set cpi t0 8.91 - > UPDATE `student` SET `cpi`= 8.91 WHERE rollno = 12
        3. Delete where cpi = 9.9 -> DELETE FROM `student` WHERE cpi = 9.9;
        4. Select all the data - > SELECT * FROM student;
*/

package main;
import java.sql.*;
public class ImportantQuestionJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/gla";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String query = "INSERT INTO `student` (`rollno`, `name`, `email`, `cpi`) VALUES ('12', 'Vaibhav', 'vai@gmail.com', '5.73') ";
            String query2=" INSERT INTO  student VALUES ('32', 'mithu', 'mithu@gmail.com', '9.99')";
            String query3=" INSERT INTO  student VALUES ('52', 'chittra', 'chittra@gmail.com', '6.99')";
            int rows = stmt.executeUpdate(query);
            int rows1 = stmt.executeUpdate(query2);
            int rows2 = stmt.executeUpdate(query3);
            String query4="UPDATE `student` SET `cpi`= 8.91 WHERE rollno = 12";
            int r=stmt.executeUpdate(query4);
            System.out.println(rows);
            System.out.println(rows1);
            System.out.println(rows2);
            System.out.println(r);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}