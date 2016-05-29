package org.fireply.enter.model;
// Generated 2016-5-26 6:45:30 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Commit generated by hbm2java
 */
public class Commit implements java.io.Serializable {

    private Integer id;
    private News news;
    private User user;
    private String content;
    private Date createTime;

    public Commit() {
    }

    public Commit(News news, String content, Date createTime) {
        this.news = news;
        this.content = content;
        this.createTime = createTime;
    }

    public Commit(News news, User user, String content, Date createTime) {
        this.news = news;
        this.user = user;
        this.content = content;
        this.createTime = createTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public News getNews() {
        return this.news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
