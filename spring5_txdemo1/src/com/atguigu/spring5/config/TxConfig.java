package com.atguigu.spring5.config;/**
 * @Author Curry
 * @Create 2021-01-1:45
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Description todo
 * @ClassName TxConfig
 * @Author admin
 * @Date 2021/1/5 1:45
 * @Version 1.0
 */

@ComponentScan(basePackages = "com.atguigu")
@EnableTransactionManagement
public class TxConfig {
    //设置数据库连接池
    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?rewriteBatchedStatements=true");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    //创建jdbc模板的对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTrancationManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }



}
