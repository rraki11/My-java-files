import java.sql.*;
import java.util.*;

public class Java4JDBCpreparestatement {
    public static void main (String[] args) {

        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "merababa7851@");
        String url = "jdbc:mysql://localhost:3306/";    //give datebase name here i.e, ..:3306/testdb; or USE it using "statement"
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, info);

            Statement stmt = con.createStatement();
            stmt.execute("USE testdb");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM std WHERE ID = ?");
            System.out.println("enter the id number: ");
            int id = sc.nextInt();
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + " " + rs.getString("Name") + " " + rs.getString("Department"));
            }

            rs.close();
            ps.close();
            sc.close();
            con.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
}
