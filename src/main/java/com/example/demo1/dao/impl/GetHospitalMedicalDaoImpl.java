package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalMedicalDao;
import com.example.demo1.pojo.HospitalMedical;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 10:29 星期四
 */

public class GetHospitalMedicalDaoImpl extends BaseDao implements HospitalMedicalDao {


    @Override
    public List<HospitalMedical> queryHospitalMedicalDaoid(int userid) {
        String sql = "select * from hospitalmedical where userId = ?";
        return queryForList(HospitalMedical.class,sql,userid);
    }

}
