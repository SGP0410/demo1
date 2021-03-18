package com.example.demo1.dao;

import com.example.demo1.pojo.SiteList;
import com.example.demo1.pojo.SubwayDetails;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/18 9:27
 */
public interface SubwayDao {

    /**
     * 根据路线Id查询路线信息
     * @param lineId
     * @return
     */
    public SubwayDetails querySubwayDetailsByLineId(int lineId);

    /**
     * 根据站点name查询站点信息
     * @param name
     * @return
     */
    public List<SiteList> querySiteListByName(String name);

    /**
     * 根据路线id查询所有站点
     * @param lineId
     * @return
     */
    public List<SiteList> querySiteListByLineId(int lineId);

}
