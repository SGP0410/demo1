package com.example.demo1.pojo;

public class User {
    private int id;
    private String userName;
    private String password;
    private String nickName;
    private String phonenumber;
    private int sex;
    private String email;
    private String avatar;
    private String idCard;

    public User(int id , String userName, String password, String nickName, String phonenumber, int sex, String email, String avatar, String idCard) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.email = email;
        this.avatar = avatar;
        this.idCard = idCard;
        this.id = id;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
