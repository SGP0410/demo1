package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalDepartmentsDao;
import com.example.demo1.pojo.Doctor;
import com.example.demo1.pojo.HospitalDepartments;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 17:08 星期四
 */

public class HospitalDepartmentsDaoImpl extends BaseDao implements HospitalDepartmentsDao {

    /**
     * 查询所有科室
     * @return
     */
    @Override
    public List<HospitalDepartments> queryHospitalDepartments() {
        String sql = "select * from hospitaldepartments";
        return queryForList(HospitalDepartments.class,sql);
    }

    @Override
    public List<Doctor> queryDoctor() {
        String sql = "select * from hospitadoctor";
        return queryForList(Doctor.class,sql);
    }

}
