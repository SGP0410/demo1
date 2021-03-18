package com.example.demo1.dao;

import com.example.demo1.pojo.BusLine;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 20:08 星期三
 */

public interface BusLineDao {

    /**
     * @param number 通过巴士编号获取行车路线
     * @return
     */
    public List<BusLine> queryBusListDao(int number);

}
