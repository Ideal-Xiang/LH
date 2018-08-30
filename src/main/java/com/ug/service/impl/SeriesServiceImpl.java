package com.ug.service.impl;

import com.ug.dao.SeriesDao;
import com.ug.domain.Series;
import com.ug.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesDao dao;

    //根据系列id查询系列信息
    @Override
    public Series selectById(int id) {
        return dao.selectById(id);
    }
}
