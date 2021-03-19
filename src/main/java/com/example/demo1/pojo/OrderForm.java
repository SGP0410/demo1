package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 8:24
 */
public class OrderForm {
    private int id;
    private String orderNum;
    private int orderType;
    private int orderStatus;
    private String shopName;
    private String orderTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderType=" + orderType +
                ", orderStatus=" + orderStatus +
                ", shopName='" + shopName + '\'' +
                ", orderTime='" + orderTime + '\'' +
                '}';
    }
}
