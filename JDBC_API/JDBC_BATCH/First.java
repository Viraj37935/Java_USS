package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class First {
	/**
	 * JDBC Batch Processing allows you to send multiple SQL statements to the
	 * database in one go, instead of executing them one by one.
	 * 
	 * Java App -> Statement / PreparedStatement -> addBatch() -> executeBatch() -> Database.
	 */

	public static void main(String[] args) throws Exception {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");

		Statement stmt = con.createStatement();

		String first = "insert into std values(1,'Atharva'),(2,'Rashmika');";
		String second = "insert into std values(3,'Ramesh'),(4,'Sakshi');";
		String third = "insert into std values(5,'Sahil');";

		stmt.addBatch(first);
		stmt.addBatch(third);
		stmt.addBatch(second);

		int[] arr = stmt.executeBatch();

		for (int i : arr) {
			System.out.println(i);

		}

		con.close();
		stmt.close();

	}

}
