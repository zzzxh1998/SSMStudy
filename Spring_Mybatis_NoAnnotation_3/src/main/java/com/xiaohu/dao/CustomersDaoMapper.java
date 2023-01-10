package com.xiaohu.dao;

import com.xiaohu.entity.Customers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomersDaoMapper {
    //查询所有
    public List<Customers> findAll();
}
