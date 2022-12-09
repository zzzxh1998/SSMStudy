package com.xiaohu.Service.Impl;

import com.xiaohu.Dao.IUserDao;
import com.xiaohu.Dao.Impl.UserDaoImpl;
import com.xiaohu.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {


    private IUserDao iUserDao ;


    public void print() {
        iUserDao.print();
    }

    public void setiUserDao(UserDaoImpl iUserDao) {
        this.iUserDao = iUserDao;
    }

}
