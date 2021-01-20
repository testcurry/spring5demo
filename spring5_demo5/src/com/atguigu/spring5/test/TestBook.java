package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-1:21
 */

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description todo
 * @ClassName TestBook
 * @Author admin
 * @Date 2021/1/4 1:21
 * @Version 1.0
 */
public class TestBook {

    @Test
    public void testjdbcTemplateInsert() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUsername("python");
        book.setUstatus("b");
        bookService.add(book);

    }

    @Test
    public void testjdbcTemplateUpdate() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("4");
        book.setUsername("spring");
        book.setUstatus("u");
        bookService.update(book);

    }

    @Test
    public void testjdbcTemplateDelete() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.delete("5");

    }

    @Test
    public void testjdbcTemplateSelectCount() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);


        int count = bookService.selectCount();
        System.out.println(count);
    }

    @Test
    public void testjdbcTemplateSelectOne() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);


        Book book = bookService.selectOne("4");
        System.out.println(book);
    }

    @Test
    public void testjdbcTemplateSelectAll() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> book = bookService.selectAll();
        System.out.println(book);

    }

    @Test
    public void testjdbcTemplateBatchAdd() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        bookService.batchAdd();
//        bookService.batchUpdate();
        bookService.batchDelete();
    }

}
