package com.atguigu.spring5;/**
 * @Author Curry
 * @Create 2021-01-21:00
 */

/**
 * @Description todo
 * @ClassName UserDaoImpl
 * @Author admin
 * @Date 2021/1/3 21:00
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update 方法执行了");
        return id;
    }
}
