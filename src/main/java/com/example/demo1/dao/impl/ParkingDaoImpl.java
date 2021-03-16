package com.example.demo1.dao.impl;

import com.example.demo1.dao.ParkingDao;
import com.example.demo1.pojo.Parkinglists;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/16 20:23
 */
public class ParkingDaoImpl extends BaseDao implements ParkingDao {
    @Override
    public List<Parkinglists> queryParking() {
        String sql = "select * from parkinglists";
        return queryForList(Parkinglists.class , sql);
    }
}
