package com.baomidou.samples.mybatis.entity;

/**
 * @Author: ysq
 * @Description: User
 * @Date: 2020/11/17 0:04
 */
public class User {
    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
