package com.example.demo1.dao;

import com.example.demo1.pojo.BusList;
import com.example.demo1.pojo.Parkinglists;
import com.example.demo1.servlet.GetBusList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 16:13 星期三
 */

public interface GetBusListDao {

    /**
     * 获取所有巴士信息
     * @return
     */
    public List<BusList> queryBusListDao();

}
