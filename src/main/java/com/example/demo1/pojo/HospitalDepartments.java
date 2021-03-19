package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/18 17:06 星期四
 */

public class HospitalDepartments {

    /**
     * id
     * did
     * categoryName
     * money
     * hospitalId
     */

    private int id;
    private String did;
    private String categoryName;
    private String money;

    public HospitalDepartments() {
    }

    public HospitalDepartments(int id, String did, String categoryName, String money) {
        this.id = id;
        this.did = did;
        this.categoryName = categoryName;
        this.money = money;
    }

    @Override
    public String toString() {
        return "HospitalDepartments{" +
                "id=" + id +
                ", did='" + did + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
