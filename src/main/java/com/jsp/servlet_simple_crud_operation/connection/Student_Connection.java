package com.jsp.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Student_Connection {
	public static Connection getStudentConnection() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//Step-2 Create Connection
			String url="jdbc:mysql://localhost:3306/product";
			String user="root";
			String pass="root";
			
			return DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
