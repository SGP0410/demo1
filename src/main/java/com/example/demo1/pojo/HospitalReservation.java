package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/18 19:58 星期四
 */

public class HospitalReservation {

    /**
     * id
     * patientName
     * divisionId
     * typesId
     * moeny
     * startime
     * userId
     */

    private int id;
    private String patientName;
    private String divisionId;
    private String typesId;
    private String moeny;
    private String startime;
    private String userId;

    public HospitalReservation() {
    }

    public HospitalReservation(int id, String patientName, String divisionId, String typesId, String moeny, String startime, String userId) {
        this.id = id;
        this.patientName = patientName;
        this.divisionId = divisionId;
        this.typesId = typesId;
        this.moeny = moeny;
        this.startime = startime;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "HospitalReservation{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", divisionId='" + divisionId + '\'' +
                ", typesId='" + typesId + '\'' +
                ", moeny='" + moeny + '\'' +
                ", startime='" + startime + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getTypesId() {
        return typesId;
    }

    public void setTypesId(String typesId) {
        this.typesId = typesId;
    }

    public String getMoeny() {
        return moeny;
    }

    public void setMoeny(String moeny) {
        this.moeny = moeny;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
