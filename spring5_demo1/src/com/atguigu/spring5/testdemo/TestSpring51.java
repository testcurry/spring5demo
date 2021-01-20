package com.atguigu.spring5.testdemo;/**
 * @Author Curry
 * @Create 2021-01-16:20
 */

import com.atguigu.spring5.Book;
import com.atguigu.spring5.dao.UserDaoImpl;
import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description todo
 * @ClassName TestSpring51
 * @Author admin
 * @Date 2021/1/2 16:20
 * @Version 1.0
 */
public class TestSpring51 {
    @Test
    public void testBook1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book1", Book.class);
        System.out.println(book);
        book.showInfo();
    }

    @Test
    public void testService() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        UserService service = context.getBean("userService", UserService.class);
       service.add();
    }
}
