package com.ug.service;

import com.ug.domain.User;

public interface UserService {

    //用户注册
    boolean insert(User user);

    //根据用户名查询用户信息
    public User queryByUserName(String username);

    //根据评论信息中的用户id查询出用户信息
    User selectByUid(int uid);

    //修改用户密码
    boolean updatePW(User user);
}
