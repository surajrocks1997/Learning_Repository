package com.suraj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDaoExample {

	public static void main(String[] args) throws Exception {

		StudentDao dao = new StudentDao();
		dao.Connect();
		Student s1  = dao.getStudent(19); 
		System.out.println(s1.sname);
		Student s2 = new Student();
		s2.sname = "Pankaj";
		s2.rollNo = 28;
		dao.addStudent(s2);
	}

}

class StudentDao{
	Connection con = null;
	
	public void Connect() throws Exception {
		String url = "jdbc:mysql://localhost:3306/test";
		String uName = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, uName, pass);
	}
	
	public Student getStudent(int rollNo) throws Exception {

		Student s = new Student();
		s.rollNo = rollNo;
		String query = "select name from table1 where rollNo=" + rollNo ;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		s.sname = name;
		
		return s;
	}
	public void addStudent(Student s) throws Exception
	{
		String query = "insert into table1 values(?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, s.sname);
		pst.setInt(2, s.rollNo);
		pst.executeUpdate();
	}
}

class Student{
	String sname;
	int rollNo;
}