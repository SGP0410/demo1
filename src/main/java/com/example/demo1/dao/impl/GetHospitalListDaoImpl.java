package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalListDao;
import com.example.demo1.pojo.HospitalList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 9:19 星期四
 */

public class GetHospitalListDaoImpl extends BaseDao implements HospitalListDao {

    @Override
    public List<HospitalList> queryHospitalList(){
        String sql = "select * from hospitallist";
        return queryForList(HospitalList.class,sql);
    }

    @Override
    public HospitalList queryHospital(int hospitalId) {
        String sql = "select * from hospitallist where hospitalId = ?";
        return queryForOne(HospitalList.class,sql,hospitalId);
    }


}
