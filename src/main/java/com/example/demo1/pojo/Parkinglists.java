package com.example.demo1.pojo;

/**
 *  @author 关鑫
 *  @date 2021/3/16 17:50 星期二
 */
public class Parkinglists {

    private int id;
    private String ParkingName;
    private String vacancy;
    private String priceCaps;
    private String imgUrl;
    private String rates;
    private String address;
    private String distance;
    private String allPark;

    public Parkinglists() {

    }

    public Parkinglists(int id, String parking, String vacancy, String priceCaps, String imgUrl, String rates, String address, String distance, String allPark) {
        this.id = id;
        this.ParkingName = parking;
        this.vacancy = vacancy;
        this.priceCaps = priceCaps;
        this.imgUrl = imgUrl;
        this.rates = rates;
        this.address = address;
        this.distance = distance;
        this.allPark = allPark;
    }

    @Override
    public String toString() {
        return "ParklotList{" +
                "id=" + id +
                ", Parking='" + ParkingName + '\'' +
                ", vacancy='" + vacancy + '\'' +
                ", priceCaps='" + priceCaps + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", rates='" + rates + '\'' +
                ", address='" + address + '\'' +
                ", distance='" + distance + '\'' +
                ", allPark='" + allPark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParkingName() {
        return ParkingName;
    }

    public void setParkingName(String parkingName) {
        ParkingName = parkingName;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getPriceCaps() {
        return priceCaps;
    }

    public void setPriceCaps(String priceCaps) {
        this.priceCaps = priceCaps;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getAllPark() {
        return allPark;
    }

    public void setAllPark(String allPark) {
        this.allPark = allPark;
    }
}
