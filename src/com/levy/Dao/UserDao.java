package com.levy.Dao;

import java.util.List;

import com.levy.hibernateClass.User;

public interface UserDao {
    public void save(User user);
    public void delete(int id);
    public User findById(int id);
    public List<User> findAll();
    public void update(User user);
}
