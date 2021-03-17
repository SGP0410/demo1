package com.example.demo1.dao.impl;

import com.example.demo1.dao.NewsDao;
import com.example.demo1.pojo.News;
import com.example.demo1.pojo.NewsCategory;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/17 8:47
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {
    @Override
    public List<News> queryNewsByPressCategory(String pressCategory) {
        String sql = "select * from news where pressCategory = ?";
        return queryForList(News.class , sql , pressCategory);
    }

    @Override
    public NewsCategory queryNewsCategoryByPressCategory(String pressCategory) {
        String sql = "select * from newsCategory where pressCategory = ?";
        return queryForOne(NewsCategory.class , sql , pressCategory);
    }

    @Override
    public List<NewsCategory> queryNewsCategory() {
        String sql = "select * from newsCategory";
        return queryForList(NewsCategory.class , sql);
    }

    @Override
    public List<News> queryNewsAll() {
        String sql = "select * from news";
        return queryForList(News.class , sql);
    }
}
