package com.xiaohu.controller;

import com.xiaohu.pojo.Books;
import com.xiaohu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询全部书籍
    @GetMapping("/queryAllBooks")
    public String books(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @PostMapping("/addBook")
    public String toUpdatePaper(Books books,Model model){
        System.out.println(books);
        int i = bookService.addBook(books);
        if(i == 1){
            model.addAttribute("msg","添加成功");
            return "redirect:/book/queryAllBooks";
        }else{
            model.addAttribute("msg","添加失败");
            return "redirect:/book/queryAllBooks";
        }
    }

    @PostMapping("/updateBook")
    public String updateBook(Books book,Model model){
        System.out.println(book);
        int i = bookService.updateBook(book);
        if(i == 1){
            model.addAttribute("msg","修改成功");
            return "redirect:/book/queryAllBooks";
        }else{
            model.addAttribute("msg","修改失败");
            return "redirect:/book/queryAllBooks";
        }
    }

    @GetMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }

    //删除书籍
    @RequestMapping("/del/{BookID}")
    public String deleteBookById(int id,Model model){
        System.out.println("----------------");
        System.out.println(id);
        int i = bookService.deleteBookById(id);
        if(i == 1){
            return "redirect:/book/queryAllBooks";
        }else{
            return "index";
        }
    }

    //查询书籍
    @PostMapping("/queryBookByName")
    public String queryBookByName(String queryBookName,Model model){
        System.out.println("搜索!!");
        List<Books> books = (List<Books>) bookService.queryBookByName(queryBookName);
        if(books == null){
            books=bookService.queryAllBook();
            model.addAttribute("book",books);
        }else{
            model.addAttribute("books",books);
        }
        return "allBook";
    }

}
