package com.kgc.dao;

import com.kgc.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
