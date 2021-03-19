package com.example.demo1.dao.impl;

import com.example.demo1.dao.OrderDao;
import com.example.demo1.pojo.OrderDetails;
import com.example.demo1.pojo.OrderForm;
import com.example.demo1.pojo.OrderStatus;
import com.example.demo1.pojo.OrderType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/19 8:41
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public List<OrderForm> queryOrderFormAll() {
        String sql = "select * from orderform";
        return queryForList(OrderForm.class , sql);
    }

    @Override
    public OrderForm queryOrderFormById(int id) {
        String sql = "select * from orderform where id = ?";
        return queryForOne(OrderForm.class , sql , id);
    }

    @Override
    public OrderStatus queryOrderStatusNameByOrderStatus(int orderStatus) {
        String sql = "select * from orderStatus where orderStatus = ?";
        return queryForOne(OrderStatus.class , sql , orderStatus);
    }

    @Override
    public OrderType queryOrderTypeNameByOrderType(int orderType) {
        String sql = "select * from orderType where orderType = ?";
        return queryForOne(OrderType.class , sql , orderType);
    }

    @Override
    public List<OrderDetails> queryOrderDetailsByOrderType(int orderType) {
        String sql = "select * from orderDetails where orderType = ?";
        return queryForList(OrderDetails.class , sql , orderType);
    }
}
