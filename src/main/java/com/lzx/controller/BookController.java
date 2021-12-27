package com.lzx.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lzx.Service.IBookService;
import com.lzx.domain.Book;
import com.lzx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;


    //查，增，改，删 分别对应getMapping,PostMapping,PutMapping,Deleteing

    @GetMapping
    public R getByAll(){
        return new R(true,bookService.list());
    }


    @PostMapping
    public R save(@RequestBody Book book){
       /* Boolean flag  = bookService.save(book) ;
        R r  = new R();
        r.setFlag(flag);
        r.setData(null);*/
        return new R(bookService.save(book));

    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.modify(book));

    }
    //@PathVariable,从路径中获取的变量
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    //htto://localhost/books/2
    @RequestMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){

        return new R(true,bookService.getPage(currentPage,pageSize));
    }
}
