package com.ug.service.impl;

import com.ug.dao.GoodsDao;
import com.ug.domain.Goods;
import com.ug.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao dao;

    @Override
    public List<Goods> selectAll(int id) {
        return dao.selectAll(id);
    }
}
