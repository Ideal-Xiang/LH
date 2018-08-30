package com.ug.service.impl;

import com.ug.dao.UserDao;
import com.ug.domain.User;
import com.ug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    //用户注册
    public boolean insert(User user) {
        return dao.insert(user) > 0;
    }

    //根据用户名查询用户信息
    public User queryByUserName(String username) {
        return dao.queryByUserName(username);
    }

}
