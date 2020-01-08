package com.suraj.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.suraj.model.Student;

public class StudentDao {
	
	
	public Student getStudent(int rollNo) throws ClassNotFoundException, SQLException {
		
		
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		String query = "select * from table1 where rollNo=" + rollNo;
		
		Student stud = new Student();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			stud.setName(rs.getString("name"));
			stud.setRollNo(rs.getInt("rollNo"));
		}
		return stud;
	}
}
