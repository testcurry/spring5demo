package com.atguigu.spring5.bean;/**
 * @Author Curry
 * @Create 2021-01-17:38
 */

/**
 *@Description todo
 *@ClassName Emp
 *@Author admin
 *@Date 2021/1/2 17:38
 *@Version 1.0
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
