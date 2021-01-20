package com.atguigu.spring5.dao;/**
 * @Author Curry
 * @Create 2021-01-0:56
 */

import com.atguigu.spring5.entity.Book;

import java.util.List;

/**
 *@Description todo
 *@ClassName BookDao
 *@Author admin
 *@Date 2021/1/4 0:56
 *@Version 1.0
 */
public interface BookDao {

    public void add(Book book);

    public void update(Book book);

    public void delete(String id);

    public int selectCount();

    public Book selectBookInfo(String id);

    public List selectAllBook();

    void batchAddBook();

    void batchUpdateBook();

    void batchDeleteBook();
}
