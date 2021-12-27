package com.lzx.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lzx.Service.BookService;
import com.lzx.Service.IBookService;
import com.lzx.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService bookService;

    @Test
    void testById(){
        System.out.println(bookService.getById(2));
    }


    @Test
    void testGetSave(){
        Book book  = new Book();
        book.setName("创业治理222");
        book.setType("创业就业122");
        book.setDescription("失业与再就业导论111");
        System.out.println( bookService.save(book));

    }


    @Test
    void testGetUpdate(){
        Book book  = new Book();
        book.setId(4);
        book.setName("创业治理书籍deeq");
        book.setType("创业就业导论qwqw");
        book.setDescription("失业与再就业如何兼容qwe");
        System.out.println( bookService.updateById(book));

    }




    @Test
    void testGetDelete(){
        Book book  = new Book();
        book.setId(5);
        System.out.println( bookService.removeById(5));

    }

    @Test
    void testGetAll(){
        System.out.println( bookService.list());

    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,3);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());

    }

/*
    @Test
    void testGetBy(){
        QueryWrapper qw = new QueryWrapper();
        qw.like("name","创业");
        bookService.selectList(qw);

    }*/

   /* @Test
    void testGetBy2(){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        String name = "Spring";
//        if(name != null)  lqw.like("name","创业");
        lqw.like(name != null,Book::getName,name);
        bookService.selectList(lqw);

    }*/
}
