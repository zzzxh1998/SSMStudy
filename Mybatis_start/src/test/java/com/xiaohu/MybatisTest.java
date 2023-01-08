package com.xiaohu;

import com.xiaohu.dao.CateGory;
import com.xiaohu.service.CateGoryService;
import org.junit.Test;

import java.util.List;

public class MybatisTest {

    private CateGoryService cateGoryService;
    @Test
    public void testFindAll(){
        List<CateGory> all = cateGoryService.findAll();
        System.out.println(all);
    }
}
