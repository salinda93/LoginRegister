package com.sldevcode.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAOImpl implements LoginDAO {

	static Connection conn;
	static PreparedStatement ps;

	@Override
	public int insertLogin(Login c) {

		int status = 0;

		try {
			conn = MyConnectionProvider.getConn();
			ps = conn.prepareStatement("insert into login values(?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
			
			status = ps.executeUpdate();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	@Override
	public Login getLogin(String userid, String pass) {
		
		Login c = new Login();

		try {
			
			conn = MyConnectionProvider.getConn();
			ps = conn.prepareStatement("select * from login where login=? and password=?");
			
			ps.setString(1, userid);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
				
			}
			
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return c;
	}

}
