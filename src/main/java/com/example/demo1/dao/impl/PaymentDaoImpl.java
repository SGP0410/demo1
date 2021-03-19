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
    public List<PaymentDetail> queryPaymentDetailByUserIdAndClassifyId(int userId , int classifyId) {
        String sql = "select * from paymentDetail where userId = ? and classifyId = ?";
        return queryForList(PaymentDetail.class , sql , userId , classifyId);
    }

    @Override
    public Group queryGroupByTypeName(int typeName) {
        System.out.println(typeName);
        String sql = "select * from `group` where typeName = 1";
        return queryForOne(Group.class , sql );
    }

    @Override
    public List<Group> queryGroupAll() {
        String sql = "select * from `group`";
        return queryForList(Group.class , sql);
    }

    @Override
    public int addGroup(Group group) {
        String sql = "insert into `group`(typeName , name) value(?,?)";
        return update(sql , group.getTypeName() , group.getName());
    }

    @Override
    public int deleteGroup(Group group) {
        String sql = "delete from `group` where name = ?";
        return update(sql , group.getName());
    }


    @Override
    public CostType queryCostTypeByClassifyId(int classifyId) {
        String sql = "select * from costType where classifyId = ?";
        return queryForOne(CostType.class , sql , classifyId);
    }

    @Override
    public CostType queryCostTypeByName(String name) {
        String sql = "select * from costType where name = ?";
        return queryForOne(CostType.class , sql , name);
    }
}
