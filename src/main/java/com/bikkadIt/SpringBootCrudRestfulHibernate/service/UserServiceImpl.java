package com.bikkadIt.SpringBootCrudRestfulHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.SpringBootCrudRestfulHibernate.dao.UserDaoI;
import com.bikkadIt.SpringBootCrudRestfulHibernate.model.User;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserDaoI userDaoI;
	
	@Override
	public int saveUserService(User user) {
		int id = userDaoI.saveUserDao(user);
		System.out.println(id);
		return id;
	}

	@Override
	public List<User> getAllUsersService() {
		List<User> list = userDaoI.getAllUserDao();
		return list;
	}

	@Override
	public User update(User user) {
		User user2 = userDaoI.update(user);
		return user2;
	}

	@Override
	public User delete(int uid) {
		User user = userDaoI.delete(uid);
		return user;
	}

}
