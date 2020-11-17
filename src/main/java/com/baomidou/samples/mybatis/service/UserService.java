package com.baomidou.samples.mybatis.service;


import com.baomidou.samples.mybatis.entity.User;

import java.util.List;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/14 0:12
 */
public interface UserService {

    void addUser(User user);

    List selectUsersFromDs();

    List selectUserFromDsGroup();
}
