package com.atguigu.spring5.entity;/**
 * @Author Curry
 * @Create 2021-01-1:08
 */

/**
 *@Description todo
 *@ClassName Book
 *@Author admin
 *@Date 2021/1/4 1:08
 *@Version 1.0
 */
public class Book {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
