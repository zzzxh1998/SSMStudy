package com.xiaohu.Service.Impl;

import com.xiaohu.Dao.IUserDao;
import com.xiaohu.Dao.Impl.UserDaoImpl;
import com.xiaohu.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
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
