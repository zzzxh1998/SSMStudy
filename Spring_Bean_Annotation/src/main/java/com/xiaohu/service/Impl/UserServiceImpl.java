package com.xiaohu.service.Impl;

import com.xiaohu.service.UserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    public void saveUser() {
        System.out.println("UserServiceImpl类的saveUser方法执行了");
    }
}
