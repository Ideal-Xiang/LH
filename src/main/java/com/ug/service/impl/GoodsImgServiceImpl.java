package com.ug.service.impl;

import com.ug.dao.GoodsImgDao;
import com.ug.domain.GoodsImg;
import com.ug.service.GoodsImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsImgServiceImpl implements GoodsImgService {

    @Autowired
    private GoodsImgDao dao;

    //根据商品ID查询该商品所有图片
    @Override
    public List<GoodsImg> queryById(int gid) {
        return dao.queryById(gid);
    }

}
