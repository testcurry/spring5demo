package com.atguigu.spring5.dao;/**
 * @Author Curry
 * @Create 2021-01-0:57
 */

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@Description todo
 *@ClassName BookDaoImpl
 *@Author admin
 *@Date 2021/1/4 0:57
 *@Version 1.0
 */

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql="insert into t_book (username,ustatus) values(?,?)";
        Object[] args={book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("添加了"+update+"条记录");
    }

    @Override
    public void update(Book book) {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        Object[] args={book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("更新了"+update+"条记录");
    }

    @Override
    public void delete(String id) {
        String sql="delete from t_book where user_id=?";
        Object[] args={id};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("删除了"+update+"条记录");
    }

    @Override
    public int selectCount() {
        String sql="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book selectBookInfo(String id) {

        String sql="select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> selectAllBook() {

        String sql="select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAddBook() {
        String sql="insert into t_book(username,ustatus) values(?,?)";
        List<Object[]> list=new ArrayList<>();
        Object[] b1={"php","bb"};
        Object[] b2={"html","bb"};
        Object[] b3={"js","bb"};
        list.add(b1);
        list.add(b2);
        list.add(b3);
        int[] args = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(args));
    }

    @Override
    public void batchUpdateBook() {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        List<Object[]> list=new ArrayList<>();
        Object[] b1={"php34","bb423","8"};
        Object[] b2={"html424","bb432","7"};
        Object[] b3={"js342","bb423","6"};
        list.add(b1);
        list.add(b2);
        list.add(b3);
        int[] args = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(args));
    }

    @Override
    public void batchDeleteBook() {
        String sql="delete from t_book where user_id=?";
        List<Object[]> list=new ArrayList<>();
        Object[] b1={"8"};
        Object[] b2={"7"};
        Object[] b3={"6"};
        list.add(b1);
        list.add(b2);
        list.add(b3);
        int[] args = jdbcTemplate.batchUpdate(sql,list);
        System.out.println(Arrays.toString(args));
    }
}
