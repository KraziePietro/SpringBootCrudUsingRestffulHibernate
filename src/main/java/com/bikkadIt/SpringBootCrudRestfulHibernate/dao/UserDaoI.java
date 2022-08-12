package com.bikkadIt.SpringBootCrudRestfulHibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bikkadIt.SpringBootCrudRestfulHibernate.model.User;

@Repository
public interface UserDaoI {

    public int saveUserDao(User user);
	
	public List<User> getAllUserDao();
		
    public User update(User user);
		 
	public User delete(int uid);
}
