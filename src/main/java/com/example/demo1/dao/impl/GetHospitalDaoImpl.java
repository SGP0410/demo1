package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalDao;
import com.example.demo1.pojo.HospitalJpg;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 8:25 星期四
 */

public class GetHospitalDaoImpl extends BaseDao implements HospitalDao {

    /**
     * @param hospitalId  通过医院编号查询医院轮播图
     * @return
     */
    @Override
    public List<HospitalJpg> queryHospitalList(int hospitalId) {
        String sql = "select * from hospitaljpg where hospitalId = ?";
        return queryForList(HospitalJpg.class,sql,hospitalId);
    }
}
