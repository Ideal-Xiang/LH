package com.ug.service.impl;

import com.ug.common.vo.UserVo;
import com.ug.dao.ReplyDao;
import com.ug.domain.Reply;
import com.ug.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyDao dao;

    //根据商品id随机查出一条评论信息
    @Override
    public Reply slectByGid(int gdid) {
        return dao.slectByGid(gdid);
    }

    //根据商品id查询出所有评论信息
    @Override
    public List<UserVo> queryById(int id) {
        return dao.queryById(id);
    }
}
