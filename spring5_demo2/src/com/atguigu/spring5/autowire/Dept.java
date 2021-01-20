package com.atguigu.spring5.autowire;/**
 * @Author Curry
 * @Create 2021-01-16:35
 */

/**
 *@Description todo
 *@ClassName Dept
 *@Author admin
 *@Date 2021/1/3 16:35
 *@Version 1.0
 */
public class Dept {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
