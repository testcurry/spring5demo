package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-20:39
 */

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factoryBean.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@Description todo
 *@ClassName TestSpring5
 *@Author admin
 *@Date 2021/1/2 20:39
 *@Version 1.0
 */
public class TestSpring5 {

    @Test
    public void testStu(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.showInfo();
    }

    @Test
    public void testStu1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.showInfo();
    }

    @Test
    public void testBook(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book1.showInfo();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testFacBean(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testOrders(){
//        ApplicationContext context=
//                new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 得到bean实例");
        System.out.println(orders);
//        orders.initMethod();
        context.close();
    }

    @Test
    public void testAutowire(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
