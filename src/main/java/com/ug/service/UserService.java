package com.ug.service;

import com.ug.domain.User;

public interface UserService {

    //用户注册
    boolean insert(User user);

    //根据用户名查询用户信息
    public User queryByUserName(String username);

}
