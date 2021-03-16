package com.example.demo1.dao.impl;

import com.example.demo1.dao.SlideshowDao;
import com.example.demo1.pojo.Slideshow;

import java.util.List;

public class SlideshowDaoImpl extends BaseDao implements SlideshowDao {
    /**
     * 根据图片类型获取轮播图引导页
     * @param type 图片类型
     * @return
     */
    @Override
    public List<Slideshow> querySlideshowByType(String type) {
        String sql = "select *from slideshow where type = ?";
        return queryForList(Slideshow.class , sql , type);
    }
}
