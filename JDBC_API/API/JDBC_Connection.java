package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class JDBC_Connection {
	/**
	 * JDBC (Java Database Connectivity) is an API that allows Java applications to interact with databases (MySQL, Oracle, PostgreSQL, etc.).
	 * 
	 * Using JDBC, Java can: Connect to a database , Execute SQL queries, Retrieve & update data, Manage transactions
	 * 
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 // Load Driver (Converts Java calls → Database calls)
		Class.forName("com.mysql.cj.jdbc.Driver");

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "1234");
		
		// Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", prop);
		System.out.println("Connected to MySQL Successfully!");

		con.close();

	}

}
