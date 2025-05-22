import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Java1BasicJDBC {

        public static void main(String[] args) {
            // JDBC URL format (no database name here)
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root"; // change this if your username is different
            String password = "merababa7851@"; // replace with your MySQL root password
    
            String dbName = "testdb";
    
            try {
                // Load MySQL JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
    
                // Connect to MySQL server
                Connection con = DriverManager.getConnection(url, user, password);
    
                // Create Statement
                Statement stmt = con.createStatement();
    
                // Create Database
                String sql = "CREATE DATABASE " + dbName;
                stmt.executeUpdate(sql);
    
                System.out.println("Database '" + dbName + "' created successfully!");
    
                // Close connection, WE CLOSE THEM TO SAVE THE DATABASE RESOURCES 
                stmt.close();
                con.close();
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }    