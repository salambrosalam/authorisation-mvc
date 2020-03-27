package com.salambrosalam.springdemo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_jdbc {

	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/authorisation?useSSL=false&serverTimezone=UTC"; 
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: "+ jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful)");
			
		}catch (Exception exc) {
			exc.printStackTrace();
		}

	}
	
}
