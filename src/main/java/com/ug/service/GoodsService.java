package com.ug.service;

import com.ug.domain.Goods;

import java.util.List;

public interface GoodsService {
    //通过系列id查询该系列所有商品
    List<Goods> selectAll(int id);
}
