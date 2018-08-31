package com.ug.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 用户评论
 */
public class UserVo {
    private int id; //主键【用户ID】
    private String username; //用户名
    private String headimg;//用户头像

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
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

    public UserVo() {
    }

    public UserVo(int id, String username, String headimg, int star, String comment, Date datetime) {
        this.id = id;
        this.username = username;
        this.headimg = headimg;
        this.star = star;
        this.comment = comment;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", headimg='" + headimg + '\'' +
                ", star=" + star +
                ", comment='" + comment + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
