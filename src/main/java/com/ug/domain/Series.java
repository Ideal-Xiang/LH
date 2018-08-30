package com.ug.domain;

import java.util.List;

/**
 * 系列表
 */
public class Series {
    private int id;//系列ID【主键】
    private String sername;//系列名称
    private String serintro;//系列介绍
    private List<SeriesImg> seriesImgs;//系列图片【一对多】

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getSerintro() {
        return serintro;
    }

    public void setSerintro(String serintro) {
        this.serintro = serintro;
    }

    public List<SeriesImg> getSeriesImgs() {
        return seriesImgs;
    }

    public void setSeriesImgs(List<SeriesImg> seriesImgs) {
        this.seriesImgs = seriesImgs;
    }

    public Series() {
    }

    public Series(int id, String sername, String serintro, List<SeriesImg> seriesImgs) {
        this.id = id;
        this.sername = sername;
        this.serintro = serintro;
        this.seriesImgs = seriesImgs;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", sername='" + sername + '\'' +
                ", serintro='" + serintro + '\'' +
                ", seriesImgs=" + seriesImgs +
                '}';
    }
}
