package com.atguigu.spring5.service;/**
 * @Author Curry
 * @Create 2021-01-23:51
 */

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * @Description todo
 * @ClassName UserService
 * @Author admin
 * @Date 2021/1/4 23:51
 * @Version 1.0
 */
@Service
//@Transactional(rollbackFor = Exception.class,noRollbackFor = Exception.class,readOnly = false,timeout = 5,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserService {

    @Autowired
    UserDao dao;

    public void accountMoney() {

        dao.reduceMoney();
        int i= 10/0;
        dao.addMoney();
    }
}
