package com.ug.domain;

/**
 * (db_seriesimg)
 * 系列图片表
 */
public class SeriesImg {
    private int id;//图片ID【主键】
    private int sid;//系列ID
    private String imgsrc;//图片路径
    private int flag;//标记位【1、横向  2、纵向】

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public SeriesImg() {
    }

    public SeriesImg(int id, int sid, String imgsrc, int flag) {
        this.id = id;
        this.sid = sid;
        this.imgsrc = imgsrc;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "SeriesImgDao{" +
                "id=" + id +
                ", sid=" + sid +
                ", imgsrc='" + imgsrc + '\'' +
                ", flag=" + flag +
                '}';
    }
}
