package com.levy.service;

import java.util.List;

import com.levy.Dao.UserDaoImp;
import com.levy.hibernateClass.User;

public class ServiceImp implements Service{
    private UserDaoImp  userDaoImp;
	public void setUserDaoImp(UserDaoImp userDaoImp) {
		this.userDaoImp = userDaoImp;
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDaoImp.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDaoImp.delete(id);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDaoImp.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDaoImp.findAll();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDaoImp.update(user);
	}
   
}
