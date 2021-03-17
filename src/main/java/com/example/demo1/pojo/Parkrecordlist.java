package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/16 21:03 星期二
 */
public class Parkrecordlist {

    private int id;
    private String entryTime;
    private String outTime;
    private String plateNumber;
    private String monetary;
    private String parkName;

    public Parkrecordlist() {
    }

    public Parkrecordlist(int id, String entryTime, String outTime, String plateNumber, String monetary, String parkName) {
        this.id = id;
        this.entryTime = entryTime;
        this.outTime = outTime;
        this.plateNumber = plateNumber;
        this.monetary = monetary;
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return "Parkrecordlist{" +
                "id=" + id +
                ", entryTime='" + entryTime + '\'' +
                ", outTime='" + outTime + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", monetary='" + monetary + '\'' +
                ", parkName='" + parkName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMonetary() {
        return monetary;
    }

    public void setMonetary(String monetary) {
        this.monetary = monetary;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }
}
