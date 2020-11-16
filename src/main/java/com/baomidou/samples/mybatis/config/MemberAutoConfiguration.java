package com.baomidou.samples.mybatis.config;

import com.baomidou.samples.mybatis.service.impl.MemberRegisterService;
import org.springframework.context.annotation.Bean;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/14 0:09
 */
public class MemberAutoConfiguration {
    @Bean
    public MemberRegisterService registerService() {
        return new MemberRegisterService();
    }

    public void foo1() {
        System.out.println("foo1");
    }
}
