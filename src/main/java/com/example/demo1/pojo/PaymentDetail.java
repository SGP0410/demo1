package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 10:45
 */
public class PaymentDetail {
    private int id;
    private String chargeUnit;
    private String typeName;
    private String doorNo;
    private int userId;
    private int classifyId;
    private int balance;
    private int electricityMoney;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(int classifyId) {
        this.classifyId = classifyId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getElectricityMoney() {
        return electricityMoney;
    }

    public void setElectricityMoney(int electricityMoney) {
        this.electricityMoney = electricityMoney;
    }

    @Override
    public String toString() {
        return "PaymentDetail{" +
                "id=" + id +
                ", chargeUnit='" + chargeUnit + '\'' +
                ", typeName='" + typeName + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", userId=" + userId +
                ", classifyId=" + classifyId +
                ", balance=" + balance +
                ", electricityMoney=" + electricityMoney +
                '}';
    }
}
