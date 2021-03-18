package com.example.demo1.dao;

import com.example.demo1.pojo.HospitalMedical;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 10:29 星期四
 */

public interface HospitalMedicalDao {

    public List<HospitalMedical> queryHospitalMedicalDaoid(int userid);

}
