package com.atguigu.spring5.testdemo;/**
 * @Author Curry
 * @Create 2021-01-17:50
 */

import com.atguigu.spring5.bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@Description todo
 *@ClassName TestBean
 *@Author admin
 *@Date 2021/1/2 17:50
 *@Version 1.0
 */
public class TestBean {

    @Test
    public void testEmp(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.showInfo();
    }

    @Test
    public void testEmp1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        emp.showInfo();
    }
}
