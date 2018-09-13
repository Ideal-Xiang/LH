package com.ug.domain;

/**
 * 购物车表
 */
public class Cart {
    private int id;//购物车ID【主键】
    private int uid;//用户ID

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
}
