package com.ug.service.impl;

import com.ug.dao.GoodsDao;
import com.ug.domain.Goods;
import com.ug.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao dao;

    //通过系列id查询该系列所有商品
    @Override
    public List<Goods> selectAll(int id) {
        return dao.selectAll(id);
    }
    //根据商品名称搜索查询出该商品所有的信息
    @Override
    public List<Goods> searchAll(String gdname) {
        return dao.searchAll(gdname);
    }
}
