package com.ug.dao;

import com.ug.domain.Series;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface SeriesDao {

    //根据系列id查询系列信息
    @Select("select * from t_series where id=#{id}")
    @ResultType(Series.class)
    Series selectById(int id);

}
