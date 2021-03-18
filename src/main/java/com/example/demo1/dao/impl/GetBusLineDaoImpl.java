package com.example.demo1.dao.impl;

import com.example.demo1.dao.BusLineDao;
import com.example.demo1.pojo.BusLine;
import com.example.demo1.pojo.BusList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 20:07 星期三
 */

public class GetBusLineDaoImpl extends BaseDao implements BusLineDao {

    /**
     * @param number 通过巴士编号获取行车路线
     * @return
     */
    @Override
    public List<BusLine> queryBusListDao(int number) {
        String sql = "select * from getbusline where number = ?";
        return queryForList(BusLine.class,sql,number);
    }


}
