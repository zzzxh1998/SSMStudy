package com.xiaohu.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.xiaohu.pojo.Books;

import java.awt.print.Book;
import java.util.List;
@Mapper
public interface BookMapper {

    int addBook(Books books);
    int updateBook(Books books);
    int deleteBookById(int id);
    Books queryBookById(int id);
    List<Books> queryAllBook();
    //根据书名查询书籍信息
    List<Books> queryBookByName(String bookName);
}
