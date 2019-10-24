package com.springist.demo.dao;

import com.springist.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
