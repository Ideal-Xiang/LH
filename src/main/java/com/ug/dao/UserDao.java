package com.ug.dao;

import com.ug.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    //用户注册
    @Insert("insert into t_user(username,email,phone,password) value(#{username},#{email},#{phone},#{password})")
    int insert(User user);

    //根据用户名查询用户信息
    @Select("select * from t_user where username=#{username}")
    @ResultType(User.class)
    public User queryByUserName(String username);


}
