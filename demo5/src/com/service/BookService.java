package com.service;

import com.bean.Book;
import com.dao.BookDao;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuesj
 * @date 2020/6/26
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }


}
