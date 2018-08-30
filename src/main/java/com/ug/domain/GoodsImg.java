package com.ug.domain;

/**
 * 商品图片表
 */
public class GoodsImg {
    private int id;//图片ID【主键】
    private int gid;//商品ID
    private String imgsrc;//图片路径
    private int flag;//标记位【1、展示图片  2、详情图片】


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
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

    public GoodsImg() {
    }

    public GoodsImg(int id, int gid, String imgsrc, int flag) {
        this.id = id;
        this.gid = gid;
        this.imgsrc = imgsrc;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "GoodsImg{" +
                "id=" + id +
                ", gid=" + gid +
                ", imgsrc='" + imgsrc + '\'' +
                ", flag=" + flag +
                '}';
    }
}
