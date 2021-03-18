package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/18 8:24 星期四
 */

public class HospitalJpg {

    private int id;
    private String imgUrl;
    private int hospitalId;

    public HospitalJpg() {
    }

    public HospitalJpg(int id, String imgUrl, int hospitalId) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "HospitalJpg{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
}
