package com;

import com.bean.Book;
import com.service.AccountService;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuesj
 * @date 2020/6/27
 */
public class BookTest {


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService);
        Book book = new Book();
        book.setBookName("西游记");
        book.setBookOrder("2");
        bookService.add(book);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.add();

    }
}
