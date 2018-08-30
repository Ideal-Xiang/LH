package com.ug.service;

import com.ug.domain.Series;

public interface SeriesService {

    //根据系列id查询系列信息
    Series selectById(int id);

}
