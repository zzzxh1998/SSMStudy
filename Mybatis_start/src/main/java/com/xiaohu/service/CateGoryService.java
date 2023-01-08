package com.xiaohu.service;

import com.xiaohu.dao.CateGory;

import java.util.List;

public interface CateGoryService {
    //查询全部
    List<CateGory> findAll();

    //根据id查询
    List<CateGory> findByID(Long id);

    //更新某行数据
    void update(Long id);

    //根据id删除某行
    void deleteByID(Long id);

    //增加一行数据
    void addOne();

    //根据名称 模糊查询
    List<CateGory> findLikeName(String name);

}
