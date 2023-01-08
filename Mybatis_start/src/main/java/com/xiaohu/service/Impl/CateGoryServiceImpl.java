package com.xiaohu.service.Impl;

import com.xiaohu.dao.CateGory;
import com.xiaohu.domain.Impl.CateGoryDaoImpl;
import com.xiaohu.service.CateGoryService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CateGoryServiceImpl implements CateGoryService {
    private CateGoryDaoImpl cateGoryDao;
    private SqlSessionFactory sqlSessionFactory;


    @Override
    public List<CateGory> findAll() {
        SqlSession session = sqlSessionFactory.openSession();

        return cateGoryDao.findAll();
    }

    @Override
    public List<CateGory> findByID(Long id) {
        return null;
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void deleteByID(Long id) {

    }

    @Override
    public void addOne() {

    }

    @Override
    public List<CateGory> findLikeName(String name) {
        return null;
    }
}
