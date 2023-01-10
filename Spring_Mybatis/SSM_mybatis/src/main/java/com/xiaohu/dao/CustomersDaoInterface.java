package com.xiaohu.dao;

import com.xiaohu.entity.Customers;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomersDaoInterface {
    //查询所有
    public List<Customers> findAll();
}
