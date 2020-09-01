package com.dao;

import com.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yuesj
 * @date 2020/6/26
 */
@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1 创建 sql 语句
        String sql = "insert into t_book (book_name,book_order) values(?,?)";
        //2 调用方法实现
        Object[] args = {book.getBookName(),book.getBookOrder()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }
}
