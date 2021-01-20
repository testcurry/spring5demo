package com.atguigu.spring5.dao;/**
 * @Author Curry
 * @Create 2021-01-19:07
 */

import org.springframework.stereotype.Repository;

/**
 * @Description todo
 * @ClassName UserDaoImpl
 * @Author admin
 * @Date 2021/1/3 19:07
 * @Version 1.0
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add..");
    }
}
