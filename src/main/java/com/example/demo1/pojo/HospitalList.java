package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/18 9:03 星期四
 */

public class HospitalList {

    private int id;
    private int hospitalId;
    private String hospitalName;
    private String brief;
    private int level;
    private String imgUrl;

    public HospitalList() {
    }

    public HospitalList(int id, int hospitalId, String hospitalName, String brief, int level, String imgUrl) {
        this.id = id;
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.brief = brief;
        this.level = level;
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "HospitalList{" +
                "id=" + id +
                ", hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", brief='" + brief + '\'' +
                ", level=" + level +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
