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
    private List<GoodsColorV> colors;//商品颜色【一对多】【1、灰色	2、黑色】
    private List<Size> sizes;//商品尺寸【一对多】【1、M	2、L】
    private String details;//商品详情
    private int flag;//标记【1、上架  2、下架】
    private String imgsrc;//图片路径
    private UserVo userVo;//用户评价
    private List<GoodsImg> goodsImgs;//商品图片【一对多】

    public Goods(int id, int sid, String gdname, double price, String gdsintro, int logo, List<GoodsColorV> colors, List<Size> sizes, String details, int flag, String imgsrc, UserVo userVo, List<GoodsImg> goodsImgs) {
        this.id = id;
        this.sid = sid;
        this.gdname = gdname;
        this.price = price;
        this.gdsintro = gdsintro;
        this.logo = logo;
        this.colors = colors;
        this.sizes = sizes;
        this.details = details;
        this.flag = flag;
        this.imgsrc = imgsrc;
        this.userVo = userVo;
        this.goodsImgs = goodsImgs;
    }

    public List<GoodsColorV> getColors() {
        return colors;
    }

    public void setColors(List<GoodsColorV> colors) {
        this.colors = colors;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

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




}
