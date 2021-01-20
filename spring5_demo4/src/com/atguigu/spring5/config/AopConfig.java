package com.atguigu.spring5.config;/**
 * @Author Curry
 * @Create 2021-01-0:31
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *@Description todo
 *@ClassName AopConfig
 *@Author admin
 *@Date 2021/1/4 0:31
 *@Version 1.0
 */

@Configuration
@ComponentScan(basePackages = {"com.atguigu"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
