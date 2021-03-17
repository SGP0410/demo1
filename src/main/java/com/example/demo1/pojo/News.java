package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/17 8:37
 */
public class News {
    private int id;
    private String title;
    private String content;
    private String imgUrl;
    private String pressCategory;
    private String theme;
    private int isRecommend;
    private int likeNumber;
    private int viewsNumber;
    private int userId;
    private String pressStatus;
    private String createTime;
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPressCategory() {
        return pressCategory;
    }

    public void setPressCategory(String pressCategory) {
        this.pressCategory = pressCategory;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public int getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public int getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(int viewsNumber) {
        this.viewsNumber = viewsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPressStatus() {
        return pressStatus;
    }

    public void setPressStatus(String pressStatus) {
        this.pressStatus = pressStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", pressCategory='" + pressCategory + '\'' +
                ", theme='" + theme + '\'' +
                ", isRecommend=" + isRecommend +
                ", likeNumber=" + likeNumber +
                ", viewsNumber=" + viewsNumber +
                ", userId=" + userId +
                ", pressStatus='" + pressStatus + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
