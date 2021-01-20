package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-1:21
 */

import com.atguigu.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Description todo
 * @ClassName TestBook
 * @Author admin
 * @Date 2021/1/4 1:21
 * @Version 1.0
 */

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig
public class TestJUint4 {

    @Autowired
    private UserService userService;

    @Test
    public void testjdbcTemplateConfig() {
        userService.accountMoney();

    }
}
