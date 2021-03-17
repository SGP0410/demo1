package com.example.demo1.dao.impl;

import com.example.demo1.dao.ParkingDao;
import com.example.demo1.dao.ParkreDao;
import com.example.demo1.pojo.Parkinglists;
import com.example.demo1.pojo.Parkrecordlist;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/16 21:07 星期二
 */
public class Parkrecord_Base extends BaseDao implements ParkreDao {


    /**
     * 获取所有停车信息
     * @return
     */
    @Override
    public List<Parkrecordlist> queryParkre() {
        String sql = "select * from parkingtime";
        return queryForList(Parkrecordlist.class,sql);
    }
}
