package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

	private static Connection connection;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="java";
		String password="java";
		return connection=DriverManager.getConnection(url, username, password);
		
	}
}
