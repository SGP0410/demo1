package com.example.demo1.pojo;

/**
 * @author 孙国鹏
 * @date 2021/3/17 20:16
 */
public class ServiceType {
    private int id;
    private int serviceType;
    private int dictValue;
    private String dictLabel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public int getDictValue() {
        return dictValue;
    }

    public void setDictValue(int dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }


    @Override
    public String toString() {
        return "ServiceType{" +
                "id=" + id +
                ", serviceType=" + serviceType +
                ", dictValue=" + dictValue +
                ", dictLabel='" + dictLabel + '\'' +
                '}';
    }
}
