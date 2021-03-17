package com.example.demo1.dao;

import com.example.demo1.pojo.Parkrecordlist;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/16 21:08 星期二
 */

public interface ParkreDao {

    /**
     *
     * @return  获取停车记录
     */
    public List<Parkrecordlist> queryParkre();

}
