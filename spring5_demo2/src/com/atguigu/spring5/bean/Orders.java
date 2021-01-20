package com.atguigu.spring5.bean;/**
 * @Author Curry
 * @Create 2021-01-15:52
 */

/**
 *@Description todo
 *@ClassName Orders
 *@Author admin
 *@Date 2021/1/3 15:52
 *@Version 1.0
 */
public class Orders {
    public Orders() {
        System.out.println("第一步 调用无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 执行set方法设置属性");
    }

    public void initMethod(){
        System.out.println("第三步 调用初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第五步 调用销毁方法");
    }
}
