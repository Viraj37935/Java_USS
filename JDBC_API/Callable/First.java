package callable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class First {
	/**
	 * CallableStatement is a JDBC interface used to call stored procedures and
	 * stored functions that are already written inside the database.
	 * 
	 * Types of Parameters -> IN => Input to Procedure OUT => Output from procedure
	 * INOUT => Input + Output
	 */

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");

		CallableStatement call = con.prepareCall("{call getuserByID(?)}");
		
		call.setInt(1, 2);
		
		ResultSet rs = call.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		 con.close();
		 call.close();
	}

}
