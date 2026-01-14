package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dynamic_API {
	
	public static void main(String[] args) {
		 
		String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "1234";
        
        String sql = "INSERT INTO USERS VALUES (?, ?, ?)";
        
        try(Connection con = DriverManager.getConnection(url,user,pass);
        	 PreparedStatement ps = con.prepareStatement(sql)){
        	
        	System.out.println("DATABASE CONNECTED...!");
        	// Disable Auto Commit 
        	 con.setAutoCommit(false);
        	 
        	 for (int i = 1; i <= 5; i++) {
                 ps.setInt(1, i);
                 ps.setString(2, "User" + i);
                 ps.setString(3, "user" + i + "@gmail.com");

                 ps.addBatch(); // Add to batch
                
             }
        	 
        	 int[] result = ps.executeBatch();
        	 
        	 con.commit();
        	 
        	 System.out.println("RECORD INSERTED: " + result.length);
        }
        catch (Exception ex) {
        	ex.getStackTrace();
        }

	}

}
