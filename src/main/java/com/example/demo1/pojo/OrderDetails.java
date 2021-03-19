package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 9:11
 */
public class OrderDetails {
    private int id;
    private String commodityName;
    private int commodityPrice;
    private int commodityNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(int commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", commodityName='" + commodityName + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityNumber=" + commodityNumber +
                '}';
    }
}
