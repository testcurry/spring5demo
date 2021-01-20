package com.atguigu.spring5.bean;/**
 * @Author Curry
 * @Create 2021-01-17:36
 */

/**
 *@Description todo
 *@ClassName Dept
 *@Author admin
 *@Date 2021/1/2 17:36
 *@Version 1.0
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
