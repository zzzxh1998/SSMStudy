package com.xiaohu.dao;

import com.xiaohu.entity.Customers;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersDaoInterface {

    //查询所有
    @Select("select * from customers")
    public List<Customers> findAll();
}
