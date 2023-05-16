package com.myblog.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myblog"})
@MapperScan
public class MyBlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBlogApiApplication.class, args);
    }

}
