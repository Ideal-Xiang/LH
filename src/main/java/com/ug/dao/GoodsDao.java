package com.ug.dao;

import com.ug.domain.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDao {
    //通过系列id查询该系列所有商品
    @Select("select * from t_goods where sid=#{sid}")
    @ResultType(Goods.class)
    List<Goods> selectAll(int id);
    //根据商品名称搜索查询出该商品所有的信息
    @Select("select * from t_goods where gdname like '%${val}%'")
    @ResultType(Goods.class)
    List<Goods> searchAll(@Param("val") String gdname);

}
