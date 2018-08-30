package com.ug.service.impl;


import com.ug.dao.SeriesImgDao;
import com.ug.domain.SeriesImg;
import com.ug.service.SeriesImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesImgServiceImpl implements SeriesImgService {

    @Autowired
    private SeriesImgDao dao;

    @Override
    public List<SeriesImg> queryById(int sid) {
        return dao.queryById(sid);
    }
}
