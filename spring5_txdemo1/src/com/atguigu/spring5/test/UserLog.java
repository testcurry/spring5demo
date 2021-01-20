package com.atguigu.spring5.test;/**
 * @Author Curry
 * @Create 2021-01-2:06
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@Description todo
 *@ClassName Log4J
 *@Author admin
 *@Date 2021/1/5 2:06
 *@Version 1.0
 */
public class UserLog {
    private static final Logger log=LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello");
        log.warn("hello warn");
    }

}
