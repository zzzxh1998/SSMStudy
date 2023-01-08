package com.xiaohu.dao;

import com.xiaohu.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
