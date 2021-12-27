package com.lzx.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lzx.domain.Book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {


    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
//        System.out.println( bookDao.getById(1));

    }

    @Test
    void testGetById2(){
        System.out.println( bookDao.selectById(3));

    }

    @Test
    void testGetSave(){
        Book book  = new Book();
        book.setName("创业治理1");
        book.setType("创业就业1");
        book.setDescription("失业与再就业导论1");
        System.out.println( bookDao.insert(book));

    }


    @Test
    void testGetUpdate(){
        Book book  = new Book();
        book.setId(4);
        book.setName("创业治理书籍");
        book.setType("创业就业导论");
        book.setDescription("失业与再就业如何兼容");
        System.out.println( bookDao.updateById(book));

    }




    @Test
    void testGetDelete(){
        Book book  = new Book();
        book.setId(5);
        System.out.println( bookDao.deleteById(5));

    }

    @Test
    void testGetAll(){
        System.out.println( bookDao.selectList(null));

    }

    @Test
    void testGetPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());

    }


    @Test
    void testGetBy(){
        QueryWrapper qw = new QueryWrapper();
        qw.like("name","创业");
        bookDao.selectList(qw);

    }

    @Test
    void testGetBy2(){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        String name = "Spring";
//        if(name != null)  lqw.like("name","创业");
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);

    }


}
