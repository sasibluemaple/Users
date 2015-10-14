package com.bluemaple.userdetails.controller;

import java.sql.SQLException;

import com.bluemaple.userdetails.dao.UserDao;
import com.bluemaple.userdetails.model.UserModel;
import com.bluemaple.userdetails.service.UserService;

public class UserController {
	
	public static void main(String arg[]) throws ClassNotFoundException, SQLException{
		UserModel userModel = new UserModel();
		userModel.setId(1);
		userModel.setName("sasi");
		userModel.setPassword("12345");
		userModel.setEmailAddress("sasi@gmail.com");
		userModel.setContact("9876543211");
		userModel.setCreatedDate("new Date()");
		userModel.setUpdatedDate("new Date()");
		UserService userService = new UserService();
		userService.addList(userModel);
	    
		UserDao userDao = new UserDao();
		userDao.addDetails(userModel);
			
		

	}
	
	
}
