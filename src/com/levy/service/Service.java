package com.levy.service;

import java.util.List;

import com.levy.hibernateClass.User;

public interface Service {
     public void addUser(User user);
     public void deleteUser(int id);
     public User findUserById(int id);
     public List<User> findAllUser();
     public void updateUser(User user);
     
        
}
