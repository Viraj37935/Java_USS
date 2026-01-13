package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Second {
	/**
	 *A transaction is a logical unit of work that contains one or more SQL statements. 
	 * 
	 * setAutoCommit() -> By default True (It Commit the CHanges Automatically) But thats not Coorect way to Store Info in DB.
	 * 					if make it False -> Disables auto-commit , Allows manual transaction control.
	 * 
	 * commit() -> Permanently saves all changes ,Ends the transaction, Cannot be undone after commit 
	 * 
	 * rollback() -> Undo all changes since last commit,  Used on error
	 */

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
		
			PreparedStatement stmt=con.prepareStatement("insert into std values(?,?);");
			
			 
			con.setAutoCommit(false);
			
			Scanner scan=new Scanner(System.in);
			try {
			int count=1;
			while(count<4) {
			System.out.println("Id:");
			int id=scan.nextInt();
			System.out.println("Name:");
			String name=scan.next();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.addBatch();
			count++;
			}
		
			 stmt.executeBatch();
			
			System.out.println("Commiting the changes");
			con.commit();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				System.out.println("intiating rollbackkkk....");
				con.rollback();
			}
			
			con.close();
			stmt.close();
	}

}
