package com.xiaohu.Service.Impl;

import com.xiaohu.Dao.IUserDao;
import com.xiaohu.Service.IUserService;

public class UserService implements IUserService {
    private IUserDao iUserDao;
    public void print() {
        System.out.println("UserService");
    }

}
