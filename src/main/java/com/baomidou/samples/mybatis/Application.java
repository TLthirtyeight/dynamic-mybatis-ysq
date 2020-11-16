package com.baomidou.samples.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/13 23:39
 */
@SpringBootApplication
@MapperScan("com.baomidou.samples.mytabis.mapper")
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
