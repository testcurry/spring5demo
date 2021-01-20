package com.atguigu.spring5.service;/**
 * @Author Curry
 * @Create 2021-01-17:51
 */

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Description todo
 * @ClassName UserService
 * @Author admin
 * @Date 2021/1/3 17:51
 * @Version 1.0
 */

//@Component (value="userService")
//@Controller
@Service
public class UserService {

    @Value("hello")
    private String name;
//    @Autowired
//    @Qualifier(value="userDaoImpl1")
//    private UserDao userDao;

//    @Resource
    @Resource(name="userDaoImpl1")
    private UserDao userDao;

    public void add() {
        System.out.println("add............"+name);
        userDao.add();
    }
}
