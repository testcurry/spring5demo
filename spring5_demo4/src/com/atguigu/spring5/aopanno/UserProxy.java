package com.atguigu.spring5.aopanno;/**
 * @Author Curry
 * @Create 2021-01-23:34
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *@Description todo
 *@ClassName UserProxy
 *@Author admin
 *@Date 2021/1/3 23:34
 *@Version 1.0
 */

//增强类
@Component
@Aspect
@Order(3)
public class UserProxy {

    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void before(){
        System.out.println("bofore.............");
    }

    @AfterReturning(value = "pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning。。。。");
    }

    @After(value = "pointCut()")
    public void after(){
        System.out.println("after。。。。");
    }

    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing。。。。");
    }

    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后。。。。");
    }
}
