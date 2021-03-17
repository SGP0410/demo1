package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/17 16:00 星期三
 */

public class BusList {

    private int id;
    private String number;
    private String name;
    private String first;
    private String end;
    private String startTime;
    private String endTime;
    private String price;
    private String mileage;

    public BusList() {
    }

    public BusList(int id, String number, String name, String first, String end, String startTime, String endTime, String price, String mileage) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.first = first;
        this.end = end;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "BusList{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", first='" + first + '\'' +
                ", end='" + end + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price='" + price + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
