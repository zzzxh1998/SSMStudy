package com.xiaohu.Service.Impl;

import com.xiaohu.Dao.IUserDao;
import com.xiaohu.Dao.Impl.UserDaoImpl;
import com.xiaohu.Service.IUserService;


public class UserServiceImpl implements IUserService {


    private IUserDao iUserDao ;


    public void print() {
        iUserDao.print();
    }

    /*
    * 构造方法注入
    * */

    public UserServiceImpl(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }
}
