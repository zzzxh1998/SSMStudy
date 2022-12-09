package com.xiaohu.Service;

import com.xiaohu.Dao.IUserDao;

public class IUserServiceImpl {
    private IUserDao iUserDao;

    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }
    public void save(){
        iUserDao.print();
    }
}
