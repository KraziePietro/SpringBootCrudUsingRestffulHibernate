package com.bikkadIt.SpringBootCrudRestfulHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.SpringBootCrudRestfulHibernate.model.User;
import com.bikkadIt.SpringBootCrudRestfulHibernate.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping(value="/addStudent", consumes = "application/json")
	public ResponseEntity<Integer> addUser(@RequestBody User user)
	{
		int id = userServiceI.saveUserService(user);
		
		return new ResponseEntity<Integer>(id,HttpStatus.OK);
	}
	
	@GetMapping (value="/getAllUserData",produces="application/json")
	public ResponseEntity<List<User>> getAllData()
	{
		List<User> allUsersService = userServiceI.getAllUsersService();
		return new ResponseEntity<List<User>>(allUsersService,HttpStatus.ACCEPTED);
	}
	
	@PutMapping(value="/updateUserData",consumes="application/json")
	public ResponseEntity<User> updateEmployee(@RequestBody User user){
		User update = userServiceI.update(user);
		return new ResponseEntity<User>(update,HttpStatus.OK);	
	}
	
	@DeleteMapping(value="/deleteUserData/{uid}" ,produces="application/json")
	public ResponseEntity<String> deleteEmployee(@PathVariable int uid){
		User delete = userServiceI.delete(uid);
		return new ResponseEntity<String>("Delete Data successfully.",HttpStatus.OK);
		
	}
}
