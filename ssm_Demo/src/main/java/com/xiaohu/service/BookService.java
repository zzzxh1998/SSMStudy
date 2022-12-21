package com.xiaohu.service;

import com.xiaohu.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int updateBook(Books books);
    //更新一本书
    int deleteBookById(int id);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
    //根据书名查询书籍信息
    List<Books> queryBookByName(String bookName);
}
