package com.example.demo1.dao.impl;

import com.example.demo1.dao.ServiceDao;
import com.example.demo1.pojo.Service;

import java.util.List;
/**
 * @author 孙国鹏
 * @date 2021/3/16 19:31
 */
public class ServiceDaoImpl extends BaseDao implements ServiceDao {
    @Override
    public List<Service> queryRecommendService() {
        String sql = "select * from service where isRecommend = ?";
        return queryForList(Service.class , sql , 1);
    }
}
