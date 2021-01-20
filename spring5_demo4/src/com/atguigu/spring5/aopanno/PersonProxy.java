package com.atguigu.spring5.aopanno;/**
 * @Author Curry
 * @Create 2021-01-0:16
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@Description todo
 *@ClassName PersonProxy
 *@Author admin
 *@Date 2021/1/4 0:16
 *@Version 1.0
 */

@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person bofore.............");
    }
}
