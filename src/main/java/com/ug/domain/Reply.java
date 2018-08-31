package com.ug.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 用户评论表
 */
public class Reply {
    private int id;//评论ID
    private int uid;//用户ID
    private int gdid;//商品ID
    private int star;//打分【1、一星  2、二星	3、三星	4、四星	5、五星】
    private String comment;//评论
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date datetime;//评论时间

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

    public int getGdid() {
        return gdid;
    }

    public void setGdid(int gdid) {
        this.gdid = gdid;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Reply() {
    }

    public Reply(int id, int uid, int gdid, int star, String comment, Date datetime) {
        this.id = id;
        this.uid = uid;
        this.gdid = gdid;
        this.star = star;
        this.comment = comment;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", uid=" + uid +
                ", gdid=" + gdid +
                ", star=" + star +
                ", comment='" + comment + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
