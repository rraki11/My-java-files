import java.util.Properties;
import java.sql.*;

public class Java3JDBCstatement {
    public static void main (String[] args) {

        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "merababa7851@");
        String url = "jdbc:mysql://localhost:3306/";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, info);
            Statement stmt = con.createStatement();
            int line1 = stmt.executeUpdate("USE testdb");
            int line2 = stmt.executeUpdate("REPLACE INTO std (Id, Name, Department) VALUES (2,'Sumanth', 'CSE')");
            int line3 = stmt.executeUpdate("REPLACE INTO std (Id, Name, Department) VALUES (3, 'Manohar', 'CSE')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM std");
            while (rs.next()) {
                System.out.println("Id is: " + rs.getInt("Id") + " Name is:" + rs.getString("Name") + " Department is:" + rs.getString("Department") );
            }

            int excutedlines = line1 + line2 + line3;
            System.out.println("total number of lines executed: " + excutedlines);

            //WE CLOSE THE CONNECTIONS OBJECTS SO THAT WE SAVE THE DATABASE RESOURCES
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// REMEMBER TO DEFINE A PRIMARY KEY, LIKE WE WE DEFINED A PRIMARY KEY (ID) MANUALLY IN THE MYSQL TERMINAL
// syntax to define a primary key: ALTER TABLE tablename add PRIMARY KEY (column name);

// USE "REPLACE INTO" TO OVER WRITE THE SAME DATA INSTEAD OF MAKEING THE DUPLICATE RECORD