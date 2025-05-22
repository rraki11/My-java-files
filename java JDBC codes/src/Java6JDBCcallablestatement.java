import java.sql.*;
import java.util.*;

public class Java6JDBCcallablestatement {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "merababa7851@");

            CallableStatement cs = con.prepareCall("{CALL Insertemp(?,?,?)}");
            
            System.out.println("enter id to insert: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("enter name to insert: ");
            String name = sc.nextLine();
            System.out.println("enter department name to insert: ");
            String department = sc.nextLine();

            cs.setInt(1,id);    //set id
            cs.setString(2,name);   //set name
            cs.setString(3,department);    //set department

            cs.execute();   //executes stored procedure
            System.out.println("Details are inserted successfully");

            cs.close();
            sc.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
