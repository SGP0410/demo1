package com.example.demo1.dao;

import com.example.demo1.pojo.HospitalList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 9:20 星期四
 */

public interface HospitalListDao {

    /**
     * 查询所有医院的详细信息
     * @return
     */
    public List<HospitalList> queryHospitalList();

    /**
     * 通过医院编号查询医院详情
     * @param hospitalId
     * @return
     */
    public HospitalList queryHospital(int hospitalId);

}
