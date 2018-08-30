package com.ug.dao;

import com.ug.domain.SeriesImg;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SeriesImgDao {

    //根据系列ID查询该系列的所有图片
    @Select("select * from t_seriesimg where sid=#{id}")
    @ResultType(SeriesImg.class)
    List<SeriesImg> queryById(int sid);

}
