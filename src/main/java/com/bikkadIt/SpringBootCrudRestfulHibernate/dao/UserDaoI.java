package com.bikkadIt.SpringBootCrudRestfulHibernate.dao;

import java.util.List;

import com.bikkadIt.SpringBootCrudRestfulHibernate.model.User;

public interface UserDaoI {

    public int saveUserDao(User user);
	
	public List<User> getAllUserDao();
	
	public  User loginCheck(User user);
	
	public User editUser(int uid);
		
    public User update(User user);
		 
	public User delete(int uid);
}
