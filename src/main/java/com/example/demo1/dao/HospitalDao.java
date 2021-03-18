package com.example.demo1.dao;

import com.example.demo1.pojo.HospitalJpg;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 8:26 星期四
 */

public interface HospitalDao {


    /**
     * @param hospitalId  通过医院编号查询医院轮播图
     * @return
     */
    public List<HospitalJpg> queryHospitalList(int hospitalId);


}
