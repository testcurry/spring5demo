package com.atguigu.spring5.autowire;/**
 * @Author Curry
 * @Create 2021-01-16:35
 */

/**
 *@Description todo
 *@ClassName Emp
 *@Author admin
 *@Date 2021/1/3 16:35
 *@Version 1.0
 */
public class Emp {
    private String name;

    private Dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
