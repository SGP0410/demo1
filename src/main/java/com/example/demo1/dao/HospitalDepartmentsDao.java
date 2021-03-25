package com.example.demo1.dao;

import com.example.demo1.pojo.Doctor;
import com.example.demo1.pojo.HospitalDepartments;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 17:09 星期四
 */

public interface HospitalDepartmentsDao {

    /**
     *查询所有科室
     * @return
     */
    public List<HospitalDepartments> queryHospitalDepartments();


    public List<Doctor> queryDoctor();

}
