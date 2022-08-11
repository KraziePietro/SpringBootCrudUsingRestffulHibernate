package com.bikkadIt.SpringBootCrudRestfulHibernate.service;

import java.util.List;

import com.bikkadIt.SpringBootCrudRestfulHibernate.model.User;

public interface UserServiceI {

	public int  saveUserService(User user);
	
	public List<User>  getAllUsersService();
	
	public  User loginCheck(User user);
	
	public User  editUser(int uid);
	
	public User update(User user);
	
	public User delete(int uid);
}
