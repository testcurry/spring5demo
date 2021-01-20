package com.atguigu.spring5.service;/**
 * @Author Curry
 * @Create 2021-01-0:55
 */

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Description todo
 *@ClassName BookService
 *@Author admin
 *@Date 2021/1/4 0:55
 *@Version 1.0
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }

    public void update(Book book){
        bookDao.update(book);
    }

    public void delete(String id){
        bookDao.delete(id);
    }

    public int selectCount(){
        int count = bookDao.selectCount();
        return count;
    }

    public Book selectOne(String id){
        Book book = bookDao.selectBookInfo(id);
        return book;
    }

    public List<Book> selectAll(){
        List<Book> list = bookDao.selectAllBook();
        return list;
    }

    public void batchAdd(){
        bookDao.batchAddBook();
    }

    public void batchUpdate(){
        bookDao.batchUpdateBook();
    }

    public void batchDelete(){
        bookDao. batchDeleteBook();
    }
}
