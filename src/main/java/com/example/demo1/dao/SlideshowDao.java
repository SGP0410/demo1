package com.example.demo1.dao;

import com.example.demo1.pojo.Slideshow;

import java.util.List;

public interface SlideshowDao {

    /**
     * 根据类型查询轮播图
     * @param type 图片类型
     * @return 返回Slideshow集合
     */
    public List<Slideshow> querySlideshowByType(String type);

}
