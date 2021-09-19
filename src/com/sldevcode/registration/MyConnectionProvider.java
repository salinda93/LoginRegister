package com.sldevcode.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {

	static Connection conn = null;

	public static Connection getConn() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(connUrl, username, pwd);
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}

		return conn;
	}

}
