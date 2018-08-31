package com.ug.service;

import com.ug.common.vo.UserVo;
import com.ug.domain.Reply;

import java.util.List;

public interface ReplyService {
    //根据商品id随机查出一条评论信息
    Reply slectByGid(int gdid);

    //根据商品id查询出所有评论信息
    List<UserVo> queryById(int id);
}
