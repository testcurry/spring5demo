package com.atguigu.spring5.collectiontype;/**
 * @Author Curry
 * @Create 2021-01-5:43
 */

import java.util.List;

/**
 * @Description todo
 * @ClassName Book
 * @Author admin
 * @Date 2021/1/3 5:43
 * @Version 1.0
 */
public class Book {
    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void showInfo() {
        System.out.println(bookList);
    }
}
