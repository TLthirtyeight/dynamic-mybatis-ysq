package com.baomidou.samples.mybatis.service.impl;

import com.baomidou.samples.mybatis.entity.User;
import com.baomidou.samples.mybatis.mapper.UserMapper;
import com.baomidou.samples.mybatis.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/14 0:11
 */
public class UserServiceImpl implements UserService {



    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user.getName(), user.getAge());
    }

    @Override
    public List selectUsersFromDs() {
        return userMapper.selectUsers();
    }

    @Override
    public List selectUserFromDsGroup() {
        return userMapper.selectUsers();
    }
}
