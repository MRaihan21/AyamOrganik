package AyamOrganik;

import java.sql.*;

public class Connect {
    
    public static Connection getConnection(){
    
    Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_ayamorganik", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        return con;
    }
}
