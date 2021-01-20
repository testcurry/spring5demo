package com.atguigu.spring5;/**
 * @Author Curry
 * @Create 2021-01-2:54
 */

/**
 * @Description todo
 * @ClassName Orders
 * @Author admin
 * @Date 2021/1/2 2:54
 * @Version 1.0
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testDemo() {
        System.out.println(oname + "::" + address);
    }
}
