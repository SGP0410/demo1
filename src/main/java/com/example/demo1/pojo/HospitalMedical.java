package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/18 10:26 星期四
 */

public class HospitalMedical {
    private int id;
    private String name;
    private String cardId;
    private String tel;
    private String sex;
    private String birthday;
    private String adders;
    private String userIdl;

    public HospitalMedical() {
    }

    public HospitalMedical(int id, String name, String cardId, String tel, String sex, String birthday, String adders, String userIdl) {
        this.id = id;
        this.name = name;
        this.cardId = cardId;
        this.tel = tel;
        this.sex = sex;
        this.birthday = birthday;
        this.adders = adders;
        this.userIdl = userIdl;
    }

    @Override
    public String toString() {
        return "HospitalMedical{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardId='" + cardId + '\'' +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", adders='" + adders + '\'' +
                ", userIdl='" + userIdl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAdders() {
        return adders;
    }

    public void setAdders(String adders) {
        this.adders = adders;
    }

    public String getUserIdl() {
        return userIdl;
    }

    public void setUserIdl(String userIdl) {
        this.userIdl = userIdl;
    }
}
