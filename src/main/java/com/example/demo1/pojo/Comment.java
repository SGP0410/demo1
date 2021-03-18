package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/17 20:54
 */
public class Comment {
    private int id;
    private String createTime;
    private String content;
    private int userId;
    private int pressId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPressId() {
        return pressId;
    }

    public void setPressId(int pressId) {
        this.pressId = pressId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", pressId=" + pressId +
                '}';
    }
}
