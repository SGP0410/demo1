package com.example.demo1.dao;

import com.example.demo1.pojo.Parkinglists;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/16 20:21
 */
public interface ParkingDao {

    /**
     * 获取所有停车场信息
     * @return
     */
    public List<Parkinglists> queryParking();
}
