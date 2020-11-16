package com.baomidou.samples.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ysq
 * @Description:
 * @Date: 2020/11/16 23:54
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("hello, world");
        return "hello, world";
    }
}
