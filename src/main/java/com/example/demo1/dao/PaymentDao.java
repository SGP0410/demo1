package com.example.demo1.dao;

import com.example.demo1.pojo.CostType;
import com.example.demo1.pojo.Group;
import com.example.demo1.pojo.PaymentDetail;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/19 11:17
 */
public interface PaymentDao {

    /**
     * 根据用户id查询缴费信息
     * @param userId
     * @return
     */
    public List<PaymentDetail> queryPaymentDetailByUserId(int userId);

    /**
     * 根据typeName查询组别
     * @param typeName
     * @return
     */
    public Group queryGroupByTypeName(int typeName);


    /**
     * 根据classifyId查询缴费类型
     * @param classifyId
     * @return
     */
    public CostType queryCostTypeByClassifyId(int classifyId);
}
