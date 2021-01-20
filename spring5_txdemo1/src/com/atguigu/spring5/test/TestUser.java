package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-1:21
 */

import com.atguigu.spring5.config.TxConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.List;

/**
 * @Description todo
 * @ClassName TestBook
 * @Author admin
 * @Date 2021/1/4 1:21
 * @Version 1.0
 */
public class TestUser {


    @Test
    public void testjdbcTemplateBatchAdd() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);

//        bookService.batchAdd();
//        bookService.batchUpdate();
        userService.accountMoney();
    }

    @Test
    public void testjdbcTemplateBatchAdd1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

//        bookService.batchAdd();
//        bookService.batchUpdate();
        userService.accountMoney();
    }

    @Test
    public void testjdbcTemplateConfig() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);

//        bookService.batchAdd();
//        bookService.batchUpdate();
        userService.accountMoney();

    }
}
