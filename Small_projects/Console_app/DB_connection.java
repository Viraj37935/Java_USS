package console_application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_connection {
	/**
	 * SQL -> 
	 * 
	 * 1. CREATE DATABASE multithread_app;
	 * 2. USE multithread_app;
	 * 3. CREATE TABLE users (
    	id INT PRIMARY KEY,
    	name VARCHAR(50),
    	email VARCHAR(50)
		);
	 */
	
	
	
	
	final static String URL = "jdbc:mysql://localhost:3306/multithread_app";
	final static String USER = "root";
	final static String PASSWORD = "1234";

	public static Connection getConnection() {
		Connection con = null;
		try {
			// Driver loading is optional (JDBC 4+)
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args)   {

		Connection con = getConnection();

		if (con != null) {
			System.out.println("✅ Database connected successfully!");
		} else {
			System.out.println("❌ Database connection failed!");
		}
		
		// Close connection 
		try {
            if (con != null) {
                con.close();
                System.out.println("🔒 Connection closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
}

 
