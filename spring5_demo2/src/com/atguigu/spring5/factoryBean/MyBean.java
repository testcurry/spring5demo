package com.atguigu.spring5.factoryBean;/**
 * @Author Curry
 * @Create 2021-01-15:14
 */

import com.atguigu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;
import sun.util.resources.cldr.or.CalendarData_or_IN;

/**
 *@Description todo
 *@ClassName MyBean
 *@Author admin
 *@Date 2021/1/3 15:14
 *@Version 1.0
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("test");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
