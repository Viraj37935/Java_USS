package console_application;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class User_task implements Runnable {
	private int id;
	private String name;
	private String email;

	public User_task(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public static void main(String[] args) {
		
	}
	public void run() {
		try (Connection con = DB_connection.getConnection()) {
			String sql = "INSERT INTO USERS VALUES (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);

			ps.executeUpdate();

			System.out.println(Thread.currentThread().getName() + " inserted record for " + name);

		} catch (Exception ex) {
			ex.printStackTrace();;
		}
	}

}

 
	

 