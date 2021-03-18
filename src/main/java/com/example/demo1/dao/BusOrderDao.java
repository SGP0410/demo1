package com.example.demo1.dao;

import com.example.demo1.pojo.BusOrder;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 21:26 星期三
 */

public interface BusOrderDao {


    /**
     * 获取定制班车订单列表
     * @return
     */
    public List<BusOrder> queryBusOrderDao();

}
