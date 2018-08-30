package com.ug.dao;

import com.ug.domain.GoodsImg;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsImgDao {

    //根据商品ID查询该商品所有图片
    @Select("select * from t_goodsimg where gid=#{gid}")
    @ResultType(GoodsImg.class)
    List<GoodsImg> queryById(int gid);

}
