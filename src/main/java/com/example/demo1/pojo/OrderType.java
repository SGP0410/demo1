package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 8:31
 */
public class OrderType {
    private int id;
    private int orderType;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderType{" +
                "id=" + id +
                ", orderType=" + orderType +
                ", name='" + name + '\'' +
                '}';
    }
}
