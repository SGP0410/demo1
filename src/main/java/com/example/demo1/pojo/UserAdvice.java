package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/19 8:32 星期五
 */

public class UserAdvice {

    /**
     * id
     * title
     * content
     * userId
     * createTime
     */

    private int id;
    private String title;
    private String content;
    private String userId;
    private String createTime;

    public UserAdvice() {
    }

    public UserAdvice(int id, String title, String content, String userId, String createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserAdvice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
