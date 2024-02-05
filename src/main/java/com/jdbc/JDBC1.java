package com.jdbc;
import java.sql.*;
public class JDBC1 {
	public void main (String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306//aliens";
		Class.forName("com.mysql.jdbc.Driver");
		String q="select name from student where ID=2";
		Connection con=DriverManager.getConnection(url,"root","Sri@Sav27");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(q);
		String name=rs.getString("name");
		System.out.print(name);
		st.close();
		con.close();
	}
}
