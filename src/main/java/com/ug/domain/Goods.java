package com.ug.domain;


import com.ug.common.vo.UserVo;

import java.util.List;

/**
 * 商品表
 */
public class Goods {
    private int id;//商品ID【主键】
    private int sid;//系列ID
    private String gdname;//商品名称
    private double price;//商品价格
    private String gdsintro;//商品简介
    private int logo;//商标【1、正品	2、免税】
    private int color;//颜色【1、灰色	2、黑色】
    private int size;//尺寸【1、M	2、L】
    private String details;//商品详情
    private int flag;//标记【1、上架  2、下架】
    private UserVo userVo;//用户评价
    private List<GoodsImg> goodsImgs;//商品图片【一对多】

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGdsintro() {
        return gdsintro;
    }

    public void setGdsintro(String gdsintro) {
        this.gdsintro = gdsintro;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<GoodsImg> getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(List<GoodsImg> goodsImgs) {
        this.goodsImgs = goodsImgs;
    }

    public Goods() {
    }

    public Goods(int id, int sid, String gdname, double price, String gdsintro, int logo, int color, int size, String details, int flag, UserVo userVo, List<GoodsImg> goodsImgs) {
        this.id = id;
        this.sid = sid;
        this.gdname = gdname;
        this.price = price;
        this.gdsintro = gdsintro;
        this.logo = logo;
        this.color = color;
        this.size = size;
        this.details = details;
        this.flag = flag;
        this.userVo = userVo;
        this.goodsImgs = goodsImgs;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", sid=" + sid +
                ", gdname='" + gdname + '\'' +
                ", price=" + price +
                ", gdsintro='" + gdsintro + '\'' +
                ", logo=" + logo +
                ", color=" + color +
                ", size=" + size +
                ", details='" + details + '\'' +
                ", flag=" + flag +
                ", userVo=" + userVo +
                ", goodsImgs=" + goodsImgs +
                '}';
    }
}
