package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDao {

	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String password = "root";
	
	public boolean check(String uname, String pass) throws ClassNotFoundException, SQLException {
		
		String query = "select * from login where uname=? and password=?";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, uname);
		pst.setString(2, pass);
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		return false;
	}
}
