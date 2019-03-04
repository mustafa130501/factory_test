package com.project.factory.databaseconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbManager {

	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			}
	catch(Exception ex)
	{
		// handle the error

	}
		try {
			 connection =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/factory","root", "");
	
		} catch (SQLException e) {
			
								}
		
		return connection;
	}
	public static void closeConnection(Connection connection, PreparedStatement preparestatement, ResultSet resultSet) {
		if(resultSet!=null) {
			try {
				resultSet.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		if(preparestatement!=null) {
			try {
				preparestatement.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		if(connection != null) {
			
			try {
				connection.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	
	}
	
	
	
	
	
	
}
