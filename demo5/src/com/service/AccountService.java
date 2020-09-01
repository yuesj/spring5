package com.service;

import com.bean.Account;
import com.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuesj
 * @date 2020/6/27
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void add(){
        accountDao.add();
        int i=1/0;
        accountDao.reduce();
    }

}
