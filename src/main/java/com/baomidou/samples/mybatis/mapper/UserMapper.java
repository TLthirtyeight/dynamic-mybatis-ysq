package com.baomidou.samples.mybatis.mapper;

import com.baomidou.samples.mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: ysq
 * @Description:
 * @Date: 2020/11/17 23:58
 */
public interface UserMapper {

    @Insert("INSERT INTO user (name, age) values (#{name}, #{age})")
    boolean addUser(@Param("name") String name, @Param("age") Integer age);

    @Select("SELECT * from user")
    List<User> selectUsers();
}
