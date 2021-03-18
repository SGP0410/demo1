package com.example.demo1.dao.impl;

import com.example.demo1.dao.BusOrderDao;
import com.example.demo1.pojo.BusOrder;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 21:25 星期三
 */

public class GetBusOrderDaoImpl extends BaseDao implements BusOrderDao {

    @Override
    public List<BusOrder> queryBusOrderDao() {
        String sql = "select * from getbusorder";
        return queryForList(BusOrder.class,sql);
    }

    @Override
    public int setBusOrderDao(BusOrder order) {
        String sql = "INSERT INTO getbusorder(start,end,userName,userTel,price,path,status,userId) VALUES (?,?,?,?,?,?,?,?)";
        return update(sql,order.getStart(),order.getEnd(),order.getUserName(),order.getUserTel(),order.getPrice(),order.getPath(),
                order.getStatus(),order.getUserId());
    }


}
