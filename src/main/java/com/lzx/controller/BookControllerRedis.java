package com.lzx.controller;

import com.lzx.Service.BookService;
import com.lzx.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/book")
public class BookControllerRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private BookService bookService;



    @PostMapping("/redis")
    public Boolean save(@RequestBody Book book) {
        //操作redis中String类型的数据，先获取ValueOperations对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set("myname", book);

        return true;
//        return bookService.save(book);

    }

    //从redis缓存中取数据
    @GetMapping("redis/getData")
    public String getData(@PathVariable String k){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object obj= valueOperations.get(k);

        return "key是k"+k+"值是obj"+obj;
    }









}
