package com.ciara.demo.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 组件扫描
 */
@SpringBootApplication
@MapperScan(  {"com.ciara.demo.user.mapper.UserMapper"})
class DemoUserApplicationTests {

    public static void main(String[] args){
        SpringApplication.run(DemoUserApplication.class,args);
    }

}
