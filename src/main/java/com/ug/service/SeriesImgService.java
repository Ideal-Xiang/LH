package com.ug.service;

import com.ug.domain.SeriesImg;

import java.util.List;

public interface SeriesImgService {
    //根据系列ID查询该系列的所有图片
    List<SeriesImg> queryById(int sid);
}
