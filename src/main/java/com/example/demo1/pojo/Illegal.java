package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/17 8:47 星期三
 */

public class Illegal {

    private int id;
    private String licencePlate;
    private String disposeState;
    private String badTime;
    private String money;
    private String deductMarks;
    private String illegalSites;
    private String noticeNo;
    private String engineNumber;
    private String catType;

    public Illegal() {
    }

    public Illegal(int id, String licencePlate, String disposeState, String badTime, String money, String deductMarks, String illegalSites, String noticeNo, String engineNumber, String catType) {
        this.id = id;
        this.licencePlate = licencePlate;
        this.disposeState = disposeState;
        this.badTime = badTime;
        this.money = money;
        this.deductMarks = deductMarks;
        this.illegalSites = illegalSites;
        this.noticeNo = noticeNo;
        this.engineNumber = engineNumber;
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "Illegal{" +
                "id=" + id +
                ", licencePlate='" + licencePlate + '\'' +
                ", disposeState='" + disposeState + '\'' +
                ", badTime='" + badTime + '\'' +
                ", money='" + money + '\'' +
                ", deductMarks='" + deductMarks + '\'' +
                ", illegalSites='" + illegalSites + '\'' +
                ", noticeNo='" + noticeNo + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
                ", catType='" + catType + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getDisposeState() {
        return disposeState;
    }

    public void setDisposeState(String disposeState) {
        this.disposeState = disposeState;
    }

    public String getBadTime() {
        return badTime;
    }

    public void setBadTime(String badTime) {
        this.badTime = badTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDeductMarks() {
        return deductMarks;
    }

    public void setDeductMarks(String deductMarks) {
        this.deductMarks = deductMarks;
    }

    public String getIllegalSites() {
        return illegalSites;
    }

    public void setIllegalSites(String illegalSites) {
        this.illegalSites = illegalSites;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
