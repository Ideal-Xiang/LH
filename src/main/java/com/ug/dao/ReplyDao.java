package com.ug.dao;

import com.ug.common.vo.UserVo;
import com.ug.domain.Reply;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReplyDao {
    //根据商品id随机查出一条评论信息
    @Select("select * from t_reply r where gdid=#{gdid} order by rand() limit 1")
    @ResultType(Reply.class)
    Reply slectByGid(int gdid);

    //根据商品id查询出所有评论信息
    @Select("select u.id,u.username,u.headimg,r.star,r.comment,r.datetime from t_user u left join t_reply r on u.id=r.uid where r.gdid=#{id}")
    @ResultType(UserVo.class)
    List<UserVo> queryById(int id);
}
