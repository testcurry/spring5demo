package com.atguigu.spring5.testdemo;/**
 * @Author Curry
 * @Create 2021-01-1:04
 */

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description todo
 * @ClassName TestSpring5
 * @Author admin
 * @Date 2021/1/2 1:04
 * @Version 1.0
 */
public class TestSpring5 {
    @Test
    public void testBook() {
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //加载配置文件
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //加载配置文件
        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);
        order.testDemo();
    }

}
