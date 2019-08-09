package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*扫描map下的类都是操作数据的类@Mapper*/
@MapperScan(value = "com.atguigu.springboot.mapper")
@SpringBootApplication
public class SpringBoot06WebMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06WebMybatisApplication.class, args);
    }

}
