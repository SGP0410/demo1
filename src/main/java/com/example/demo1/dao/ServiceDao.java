package com.example.demo1.dao;

import com.example.demo1.pojo.Service;
import com.example.demo1.pojo.ServiceType;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/16 17:46
 */
public interface ServiceDao {
    /**
     * 获取推荐服务
     * @return
     */
    public List<Service> queryRecommendService();

    /**
     * 获取所有服务
     * @return
     */
    public List<Service> queryService();

    /**
     * 获取所有服务类型
     * @return
     */
    public List<ServiceType> queryServiceType();

}
