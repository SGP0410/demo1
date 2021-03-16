package com.example.demo1.dao.impl;

import com.example.demo1.dao.SlideshowDao;
import com.example.demo1.pojo.Slideshow;

import java.util.List;

public class SlideshowDaoImpl extends BaseDao implements SlideshowDao {
    @Override
    public List<Slideshow> querySlideshowByType(String type) {
        String sql = "select *from slideshow where type = ?";
        return queryForList(Slideshow.class , sql , type);
    }
}
