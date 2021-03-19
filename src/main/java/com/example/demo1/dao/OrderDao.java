package com.example.demo1.dao;

import com.example.demo1.pojo.OrderDetails;
import com.example.demo1.pojo.OrderForm;
import com.example.demo1.pojo.OrderStatus;
import com.example.demo1.pojo.OrderType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/19 8:35
 */
public interface OrderDao {

    /**
     * 查询所有订单
     * @return
     */
    public List<OrderForm> queryOrderFormAll();

    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    public OrderForm queryOrderFormById(int id);

    /**
     * 根据orderStatus获取支付状态
     * @param orderStatus
     * @return
     */
    public OrderStatus queryOrderStatusNameByOrderStatus(int orderStatus);

    /**
     * 根据orderType获取订单类型
     * @param orderType
     * @return
     */
    public OrderType queryOrderTypeNameByOrderType(int orderType);

    /**
     * 根据订单类型获取订单详情
     * @param orderType
     * @return
     */
    public List<OrderDetails> queryOrderDetailsByOrderType(int orderType);
}
