import java.sql.*;
import java.util.Properties;

public class Java2JDBC {
    public static void main (String[] args) {

        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "merababa7851@");
        String url = "jdbc:mysql://localhost:3306/";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, info);

            stmt = con.createStatement();
            stmt.execute("USE testdb");
            rs = stmt.executeQuery("SELECT * FROM std");

            while (rs.next()){
                System.out.println(" Id:" + rs.getInt("Id") + " Name:" + rs.getString("Name") + " Department:" + rs.getString("Department"));
            }
            //we can also give "columnIndex" instead of "comlumnLabel" i.e, rs.getInt(1)
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {

            //WE CLOSE THE CONNECTIONS OBJECTS SO THAT WE SAVE THE DATABASE RESOURCES
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}
