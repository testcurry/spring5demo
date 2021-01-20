package com.atguigu.spring5.bean;/**
 * @Author Curry
 * @Create 2021-01-16:15
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 *@Description todo
 *@ClassName MyBeanPost
 *@Author admin
 *@Date 2021/1/3 16:15
 *@Version 1.0
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前的方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后的方法");
        return bean;
    }
}
