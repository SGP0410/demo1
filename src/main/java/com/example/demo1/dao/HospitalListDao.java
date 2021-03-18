package com.example.demo1.dao;

import com.example.demo1.pojo.HospitalList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 9:20 星期四
 */

public interface HospitalListDao {

    public List<HospitalList> queryHospitalList();

    public HospitalList queryHospital(int hospitalId);

}
