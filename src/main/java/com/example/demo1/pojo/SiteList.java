package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/18 9:25
 */
public class SiteList {
    private int id;
    private int lineId;
    private String name;
    private int distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "SiteList{" +
                "id=" + id +
                ", lineId=" + lineId +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
