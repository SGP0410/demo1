package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/17 21:12 星期三
 */

public class BusOrder {

    private int id;
    private String start;
    private String end;
    private String userName;
    private String userTel;
    private String price;
    private String path;
    private String status;
    private String userId;

    public BusOrder() {
    }

    public BusOrder(int id, String start, String end, String userName, String userTel, String price, String path, String status, String userId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.userName = userName;
        this.userTel = userTel;
        this.price = price;
        this.path = path;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BusOrder{" +
                "id=" + id +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", price='" + price + '\'' +
                ", path='" + path + '\'' +
                ", status='" + status + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
