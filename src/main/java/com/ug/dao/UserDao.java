package com.ug.dao;

import com.ug.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {

    //用户注册
    @Insert("insert into t_user(username,email,phone,password,headimg) value(#{username},#{email},#{phone},#{password},'201808\\\\lixiang\\\\001.jpg')")
    int insert(User user);

    //根据用户名查询用户信息
    @Select("select * from t_user where username=#{username}")
    @ResultType(User.class)
    public User queryByUserName(String username);

    //根据评论信息中的用户id查询出用户信息
    @Select("select * from t_user where id=#{uid} ")
    @ResultType(User.class)
    User selectByUid(int uid);

    //修改用户密码
    @Update("update t_user set password=#{password} where id=#{id}")
    int updatePW(User user);
}
