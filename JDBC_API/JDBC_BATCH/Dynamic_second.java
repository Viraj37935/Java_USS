package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Dynamic_second {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");

		PreparedStatement stmt = con.prepareStatement("INSERT INTO USERS VALUES(?,?,?);");

		con.setAutoCommit(false);

		Scanner scan = new Scanner(System.in);
		int count = 1;
		while (count < 5) {
			System.out.println("ID:");
			int id = scan.nextInt();
			System.out.println("Name:");
			String name = scan.next();
			System.out.println("Email:");
			String email = scan.next();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);

			stmt.addBatch();
			count++;
		}

		int[] result = stmt.executeBatch();

		Thread.sleep(10000);
		System.out.println("Commiting the changes.....");

		con.commit();
		for (int i : result) {
			System.out.println(i);
		}

		con.close();
		stmt.close();

	}

}
