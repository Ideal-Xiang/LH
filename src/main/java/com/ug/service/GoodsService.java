package com.ug.service;

import com.ug.domain.Goods;

import java.util.List;

public interface GoodsService {
    //通过系列id查询该系列所有商品
    List<Goods> selectAll(int id);
    //根据商品名称搜索查询出该商品所有的信息
    List<Goods> searchAll(String gdname);
}
