package BusRes;

import java.sql.*;

public class Dbconnection {
	private static final String url="jdbc:mysql://localhost:3306/busres";
	private static final String username="root";
	private static final String password="Sanju@2003";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}

	
}
