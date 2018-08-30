package com.ug.service;

import com.ug.domain.GoodsImg;

import java.util.List;

public interface GoodsImgService {
    //根据商品ID查询该商品所有图片
    List<GoodsImg> queryById(int gid);
}
