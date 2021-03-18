package com.example.demo1.dao;

import com.example.demo1.pojo.HospitalReservation;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 20:05 星期四
 */

public interface HospitalReservationDao {


    /**
     * 通过用户id插叙你预约列表
     * @param userid
     * @return
     */
    public List<HospitalReservation> queryHospitalUserid(String userid);

    /**
     * 提交预约单
     * @param patientName       姓名
     * @param divisionId        科室
     * @param typesId           1专家   2普通
     * @param moeny             费用
     * @param startime          时间
     * @param userId            用户id
     * @return
     */
    public int HospitalReservation(String patientName, String divisionId, String typesId, String moeny, String startime, String userId);

}
