package com.ug.web.controller;

import com.ug.common.vo.ResultVo;
import com.ug.domain.User;
import com.ug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    //注册
    @RequestMapping("/registe.do")
    @ResponseBody
    public ResultVo<User> userAdd(User user) {
        System.out.println(user);
        if (user.getUsername() != null && user.getUsername().length()>0) {
            User user1 = service.queryByUserName(user.getUsername());
            if (user1 != null) {
                return ResultVo.setERROR("用户名已被使用",null);
            } else {
                if (service.insert(user)) {
                    return ResultVo.setOK("注册成功",null);
                } else {
                    return ResultVo.setERROR("注册失败",null);
                }
            }
        } else {
            return ResultVo.setERROR("请输入用户名",null);
        }
    }

    //登陆
    @RequestMapping("/login.do")
    @ResponseBody
    public ResultVo<User> userLogin(User user) {
        if (user != null) {
            User user1 = service.queryByUserName(user.getUsername());
            if (user1 != null) {
                if (Objects.equals(user.getUsername(),user1.getUsername())) {
                    if (Objects.equals(user.getPassword(),user1.getPassword())) {
                        System.out.println("登陆成功");
                        return ResultVo.setOK("登陆成功",null);
                    } else {
                        return ResultVo.setERROR("密码错误",null);
                    }
                } else {
                    return ResultVo.setERROR("用户名错误",null);
                }
            } else {
                return ResultVo.setERROR("用户名不存在",null);
            }
        } else {
            return ResultVo.setERROR("请输入账号和密码",null);
        }
    }
}
