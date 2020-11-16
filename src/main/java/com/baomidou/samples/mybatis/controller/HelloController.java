package com.baomidou.samples.mybatis.controller;

import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import com.baomidou.samples.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/14 0:17
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    DynamicDataSourceProperties dynamicDataSourceProperties;

}
