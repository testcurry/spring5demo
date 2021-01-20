package com.atguigu.spring5.service;/**
 * @Author Curry
 * @Create 2021-01-17:01
 */

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * @Description todo
 * @ClassName UserService
 * @Author admin
 * @Date 2021/1/2 17:01
 * @Version 1.0
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.....");
        userDao.update();
        //原始方式创建UserDao对象
        //UserDao userDao=new UserDaoImpl();
        //userDao.update();
    }
}
