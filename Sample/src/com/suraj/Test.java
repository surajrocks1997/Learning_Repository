package com.suraj; 
import java.sql.*;

class Test{
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/test";
		String uName = "root";
		String pass = "root";
		String name = "Mahesh";
		int rollNo = 19;
		
		String query = "insert into table1 values(?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		PreparedStatement st = con.prepareStatement(query);
		
		st.setString(1, name);
		st.setInt(2, rollNo);
		
		int count = st.executeUpdate();
		System.out.println(count + "rows affected");
		st.close();
		con.close();
		
	}
}