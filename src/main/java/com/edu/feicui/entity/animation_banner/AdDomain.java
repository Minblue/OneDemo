package com.edu.feicui.entity.animation_banner;

/**
 * 作者：七哓蛮 to 2016/9/10
 * 邮箱：xiaoman_at@yeah.net
 */
public class AdDomain {
    private String id; //id
    private String date; //地址
    private String title; // 标题
    private String topicFrom;
    private String topic;
    private String imgUrl; // URL
    private boolean isAd;

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setAd(boolean isAd) {
        this.isAd = isAd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicFrom() {
        return topicFrom;
    }

    public void setTopicFrom(String topicFrom) {
        this.topicFrom = topicFrom;
    }
}
