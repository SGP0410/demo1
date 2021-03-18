package com.example.demo1.dao.impl;

import com.example.demo1.dao.GetBusListDao;
import com.example.demo1.pojo.BusList;
import com.example.demo1.servlet.GetBusList;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 16:12 星期三
 */

public class GetBusListDaoImpl extends BaseDao implements GetBusListDao {

    /**
     * 获取所有巴士信息
     * @return
     */
    @Override
    public List<BusList> queryBusListDao() {
        String sql = "select * from getBuslist";
        return queryForList(BusList.class,sql);
    }

    /**
     * 通过巴士编号获取详细新消息
     * @param number  巴士编号
     * @return
     */
    public BusList queryBusid(int number){
        String sql = "select * from getBuslist where id = ?";
        return queryForOne(BusList.class,sql,number);
    }

}
