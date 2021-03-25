package com.example.demo1.pojo;

/**
 * @author 关鑫
 * @date 2021/3/25 9:00 星期四
 */

public class Doctor {


    /**
     * id
     * hospitalId
     * deptId
     * doctorId
     * doctorName
     * desc
     * desc
     */

    private String id;
    private String hospitalId;
    private String deptId;
    private String doctorName;
    private String desc;

    public Doctor() {
    }

    public Doctor(String id, String hospitalId, String deptId, String doctorName, String desc) {
        this.id = id;
        this.hospitalId = hospitalId;
        this.deptId = deptId;
        this.doctorName = doctorName;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
