package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/18 9:22
 */
public class SubwayDetails {
    private int lineId;
    private String lineName;
    private String nextName;
    private String imgUrl;
    private int speed;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SubwayDetails{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", nextName='" + nextName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", speed=" + speed +
                '}';
    }
}
