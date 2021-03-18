package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalReservationDao;
import com.example.demo1.pojo.HospitalReservation;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 20:04 星期四
 */

public class GetHospitalReservationDaoImpl extends BaseDao implements HospitalReservationDao {


    /**
     * 通过userid查询预约单
     * @param userid
     * @return
     */
    @Override
    public List<HospitalReservation> queryHospitalUserid(String userid) {
        String sql = "select * from hospitalreservation where userid = ?";
        return queryForList(HospitalReservation.class,sql,userid);
    }

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
    public int HospitalReservation(String patientName, String divisionId, String typesId, String moeny, String startime, String userId) {
        String sql = "INSERT INTO hospitalreservation(patientName,divisionId,typesId,moeny,startime,userId) VALUES (?,?,?,?,?,?)";
        return update(sql,patientName,divisionId,typesId,moeny,startime,userId);
    }
}
