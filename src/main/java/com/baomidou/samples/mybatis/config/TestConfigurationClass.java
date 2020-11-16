package com.baomidou.samples.mybatis.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurationClass {

    @Bean
    public Foo1 getFoo1() {
        return new Foo1();
    }
}
