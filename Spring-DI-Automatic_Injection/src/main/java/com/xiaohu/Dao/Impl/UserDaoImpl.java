package com.xiaohu.Dao.Impl;

import com.xiaohu.Dao.IUserDao;
import org.springframework.stereotype.Component;

public class UserDaoImpl implements IUserDao {
    public void print() {
        System.out.println("IUserDao类的print方法");
    }
}
