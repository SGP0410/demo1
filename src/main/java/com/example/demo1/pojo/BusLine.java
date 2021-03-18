package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/17 20:02 星期三
 */

public class BusLine {

    private int id;
    private int number;
    private int stepsId;
    private String name;

    public BusLine() {
    }

    public BusLine(int id, int number, int stepsId, String name) {
        this.id = id;
        this.number = number;
        this.stepsId = stepsId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BusLine{" +
                "id=" + id +
                ", number=" + number +
                ", stepsId=" + stepsId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStepsId() {
        return stepsId;
    }

    public void setStepsId(int stepsId) {
        this.stepsId = stepsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
