package com.example.demo1.dao.impl;

import com.example.demo1.dao.PaymentDao;
import com.example.demo1.pojo.CostType;
import com.example.demo1.pojo.Group;
import com.example.demo1.pojo.PaymentDetail;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/19 11:23
 */
public class PaymentDaoImpl extends BaseDao implements PaymentDao {
    @Override
    public List<PaymentDetail> queryPaymentDetailByUserId(int userId) {
        String sql = "select * from paymentDetail where userId = ?";
        return queryForList(PaymentDetail.class , sql , userId);
    }

    @Override
    public Group queryGroupByTypeName(int typeName) {
        System.out.println(typeName);
        String sql = "select * from `group` where typeName = 1";
        return queryForOne(Group.class , sql );
    }

    @Override
    public CostType queryCostTypeByClassifyId(int classifyId) {
        System.out.println(classifyId);
        String sql = "select * from costType where classifyId = ?";
        return queryForOne(CostType.class , sql , classifyId);
    }
}
