package com.bluemaple.userdetails.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bluemaple.userdetails.model.UserModel;

public class UserDao {
	Connection connection;
	PreparedStatement p;
	ResultSet rs;
	
	public void addDetails(UserModel userModel) throws ClassNotFoundException, SQLException {
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://LocalHost:3306/student";

		
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL, "root", "admin");
			p = connection
					.prepareStatement("insert into altered values(?,?,?,?,?,?,?,?)");
		    p.setInt(1, userModel.getId());
		    p.setString(2, userModel.getName());
		    p.setString(3, userModel.getPassword());
		    p.setString(4, userModel.getEmailAddress());
		    p.setString(5, userModel.getSex());
		    p.setString(6, userModel.getContact());
		    p.setString(7, userModel.getCreatedDate());
		    p.setString(8, userModel.getUpdatedDate());
		    int i = p.executeUpdate();
			if (i == 1) {
				System.out.println("inserted");
			}
	}	
}


