package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalListDao;
import com.example.demo1.pojo.HospitalList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 9:19 星期四
 */

public class GetHospitalListDaoImpl extends BaseDao implements HospitalListDao {

    /**
     * 查询所有医院信息
     * @return
     */
    @Override
    public List<HospitalList> queryHospitalList(){
        String sql = "select * from hospitallist";
        return queryForList(HospitalList.class,sql);
    }

    /**
     * 通过医院编号查询医院的详细信息
     * @param hospitalId
     * @return
     */
    @Override
    public HospitalList queryHospital(int hospitalId) {
        String sql = "select * from hospitallist where hospitalId = ?";
        return queryForOne(HospitalList.class,sql,hospitalId);
    }


}
