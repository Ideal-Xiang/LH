package com.ug.common.vo;

import com.ug.domain.Goods;
import com.ug.domain.Series;
import com.ug.domain.SeriesImg;

import java.util.List;

/**
 * 系列所有信息
 */
public class SeriesVo {
    private Series series;//系列信息
    private List<Goods> goodsList;//系列商品

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public SeriesVo() {
    }

    public SeriesVo(Series series, List<Goods> goodsList) {
        this.series = series;
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "SeriesVo{" +
                "series=" + series +
                ", goodsList=" + goodsList +
                '}';
    }
}
