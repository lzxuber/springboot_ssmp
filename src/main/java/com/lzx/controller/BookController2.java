package com.lzx.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lzx.Service.IBookService;
import com.lzx.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService bookService;


    //查，增，改，删 分别对应getMapping,PostMapping,PutMapping,Deleteing

    @GetMapping
    public List<Book> getByAll(){
        return bookService.list();
    }


    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);

    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.modify(book);

    }
    //@PathVariable,从路径中获取的变量
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }

    //htto://localhost/books/2
    @RequestMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){

        return bookService.getPage(currentPage,pageSize);
    }
}
