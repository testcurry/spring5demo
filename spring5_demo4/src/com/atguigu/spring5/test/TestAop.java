package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-23:45
 */

import com.atguigu.spring5.aopXML.Book;
import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.config.AopConfig;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@Description todo
 *@ClassName TestAop
 *@Author admin
 *@Date 2021/1/3 23:45
 *@Version 1.0
 */
public class TestAop {

    @Test
    public void testAopAnno0(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        User user = context.getBean("user",User.class);
        user.add();

    }

    @Test
    public void testAopAnno1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user",User.class);
        user.add();

    }

    @Test
    public void testAopAnno2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
