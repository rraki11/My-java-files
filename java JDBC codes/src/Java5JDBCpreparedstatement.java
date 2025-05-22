import java.sql.*;
import java.util.*;

public class Java5JDBCpreparedstatement {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "merababa7851@");
        String url = "jdbc:mysql://localhost:3306/testdb";    //give datebase name here or use "USE databasename" in "statement"

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, info);

            //creating a perpared statement to insert records without repetation after declaring primary key as ID
            PreparedStatement psInsert = con.prepareStatement("REPLACE INTO std (Id, Name, Department) VALUES (?,?,?)");

            //getting the record values from the user
            System.out.println("enter new id: ");
            int newid = sc.nextInt();
            sc.nextLine();
            System.out.println("enter new name: ");
            String newname = sc.nextLine();
            System.out.println("enter department name: ");
            String newdepartment = sc.nextLine();

            //setting the record vaues given by the user to the database
            psInsert.setInt(1,newid);
            psInsert.setString(2,newname);
            psInsert.setString(3, newdepartment);

            int roweffected = psInsert.executeUpdate();
            System.out.println("number of rows effected: " + roweffected);

            PreparedStatement psSelect = con.prepareStatement("SELECT * FROM std");
            ResultSet rs = psSelect.executeQuery("SELECT * FROM std");

            while (rs.next()) {
                System.out.println(" Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Department: " + rs.getString(3));
            }

            rs.close();
            psSelect.close();
            psInsert.close();
            sc.close();
            con.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
