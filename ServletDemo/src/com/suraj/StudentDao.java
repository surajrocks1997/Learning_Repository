package com.suraj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{

	public void update(Student s) 
	{	
			String name = s.getName();
			int rollNo = s.getRollNo();
			
			
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "root";
			String query = "insert into table1 values(?,?)";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, name);
				pst.setInt(2, rollNo);
				pst.executeUpdate();
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		
	}
}	
