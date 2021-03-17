package com.example.demo1.dao.impl;

import com.example.demo1.dao.IllegalDao;
import com.example.demo1.pojo.Illegal;
import com.example.demo1.pojo.Parkinglists;
import org.apache.commons.dbutils.QueryRunner;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 8:51 星期三
 */

public class IllegalDaoImpl extends BaseDao implements IllegalDao {

    @Override
    public List<Illegal> queryIllegalcph_fdj_type(String licencePlate, int engineNumber, String catType) {
        String sql = "select * from illegal where licencePlate = ? and engineNumber = ? and catType = ?";
        return queryForList(Illegal.class,sql,licencePlate,engineNumber,catType);
    }


    public Illegal queryIllegalid(int id) {
        String sql = "select * from illegal where id = ?";
        return queryForOne(Illegal.class,sql,id);
    }
}
