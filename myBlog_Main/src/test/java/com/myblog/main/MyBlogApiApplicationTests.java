package com.myblog.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class MyBlogApiApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception{

        System.out.println("测试");
        System.out.println("获取数据库连接为:" + dataSource.getConnection());
    }

}
