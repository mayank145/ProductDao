package com.lti.service;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static void main(String arg[]) {
		Connection conn = null;
				try {
			//step 1. loading the JDBC driver
			// for Derby
					Class.forName("org.apache.derby.jdbc.ClientDriver");
					
			//step 2. Establishing connect with database
			//for Derby
					
					String url="jdbc:derby://localhost:1527/trainingdb";
					String user="mayank";
					String pass="mayank";
			
					conn = DriverManager.getConnection(url,user,pass);
					System.out.println("CONNECTION SUCCESSFUL...");
					
					//Now let's see how to perform SQL operation
				// for ex: If we want to fire an INSERT/PDATE/DELETE/SELECT statement
					//There are 2 ways
					//1. statement
					//2. PreparedStatement
					
					Statement st= (Statement) conn.createStatement();
					
					PreparedStatement pst=conn.
					
					
					//The problem with statement object to execute any SQL is
					//1. The database will have to complile the SQL again and again if the same query executed repeda
		}
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{conn.close();} catch(Exception e) {}
		}
	}

}
