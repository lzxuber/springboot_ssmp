package com.lzx.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lzx.domain.Book;

import java.util.List;

public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getByAll();
    IPage<Book> getPage(int currentPage,int pageSize);
}
