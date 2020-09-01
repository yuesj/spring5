package com.dao;

import com.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author yuesj
 * @date 2020/6/27
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void add() {
        String sql = "update t_account set money=money+? where id=?";
        jdbcTemplate.update(sql,100,2);
    }

    @Override
    public void reduce() {
        String sql = "update t_account set money=money-? where id=?";
        jdbcTemplate.update(sql,100,1);
    }
}
