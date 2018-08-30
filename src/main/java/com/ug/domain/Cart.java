package com.ug.domain;

/**
 * 购物车表
 */
public class Cart {
    private int id;//购物车ID【主键】
    private int uid;//用户ID
    private int gid;//商品ID
    private int gdscount;//商品数量
    private double allprice;//总价格

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGdscount() {
        return gdscount;
    }

    public void setGdscount(int gdscount) {
        this.gdscount = gdscount;
    }

    public double getAllprice() {
        return allprice;
    }

    public void setAllprice(double allprice) {
        this.allprice = allprice;
    }
}
