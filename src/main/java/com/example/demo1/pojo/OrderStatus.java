package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/19 8:29
 */
public class OrderStatus {
    private int id;
    private int orderStatus;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                ", name='" + name + '\'' +
                '}';
    }
}
