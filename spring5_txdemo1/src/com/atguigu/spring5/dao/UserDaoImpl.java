package com.atguigu.spring5.dao;/**
 * @Author Curry
 * @Create 2021-01-23:51
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description todo
 * @ClassName UserDaoImpl
 * @Author admin
 * @Date 2021/1/4 23:51
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update t_account set balance=balance-100 where id=1";
        jdbcTemplate.update(sql);
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set balance=balance+100 where id=2";
        jdbcTemplate.update(sql);
    }
}
