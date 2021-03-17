package com.example.demo1.dao;

import com.example.demo1.pojo.Illegal;
import com.example.demo1.pojo.Parkinglists;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 8:52 星期三
 */

public interface IllegalDao {

    /**
     * @param licencePlate  车牌
     * @param engineNumber  发动机号
     * @param catType       小型车
     * @return
     */
    public List<Illegal> queryIllegalcph_fdj_type(String licencePlate, int engineNumber, String catType);


    public Illegal queryIllegalid(int id);

}
