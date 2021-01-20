package com.atguigu.spring5.aopanno;/**
 * @Author Curry
 * @Create 2021-01-23:33
 */

import org.springframework.stereotype.Component;

/**
 *@Description todo
 *@ClassName User
 *@Author admin
 *@Date 2021/1/3 23:33
 *@Version 1.0
 */

//被增强类
@Component
public class User {
    public void add(){
//        int i=1/0;
        System.out.println("add........");
    }
}
