package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-20:39
 */
import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

    @Test
    public void test2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

}
