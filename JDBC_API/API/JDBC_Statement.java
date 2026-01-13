package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Statement {
	/**
	 * Statement -> is an interface used to send static SQL queries from a Java program to a database.
	 * 
	 * locat -> java.sql.Statement.
	 * 
	 * Methods -> executeQuery()(SELECT) / executeUpdate() (INSERT / UPDATE / DELETE / DDL) / execute() (ANY SQL).
	 * @throws SQLException 
	 */

	public static void main(String[] args) throws SQLException {
		 Connection con = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/jdbc", "root", "1234");
		 System.out.println("connection opened!");
		 
		 Statement stmt = con.createStatement();
		 
		 int n = stmt.executeUpdate("insert into STD values(102, 'Raviraj')");
		 
		 System.out.println(n+ " " + "RECORD INSERTED");

	}

}
