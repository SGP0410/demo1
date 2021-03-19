package com.example.demo1.dao.impl;

import com.example.demo1.dao.SubwayDao;
import com.example.demo1.pojo.SiteList;
import com.example.demo1.pojo.SubwayDetails;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/18 9:33
 */
public class SubwayDaoImpl extends BaseDao implements SubwayDao {

    @Override
    public SubwayDetails querySubwayDetailsByLineId(int lineId) {
        String sql = "select * from subwayDetails where lineId = ?";
        return queryForOne(SubwayDetails.class , sql , lineId);
    }

    @Override
    public List<SiteList> querySiteListByName(String name) {
        String sql = "select * from siteList where name = ?";
        return queryForList(SiteList.class , sql , name);
    }

    @Override
    public List<SiteList> querySiteListByLineId(int lineId) {
        String sql = "select * from siteList where lineId = ?";
        return queryForList(SiteList.class , sql , lineId);
    }
}
