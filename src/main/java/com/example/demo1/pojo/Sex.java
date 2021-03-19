package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/18 14:49
 */
public class Sex {
    private int id;
    private String sexName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", sexName='" + sexName + '\'' +
                '}';
    }
}
