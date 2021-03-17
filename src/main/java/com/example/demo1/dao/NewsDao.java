package com.example.demo1.dao;

import com.example.demo1.pojo.News;
import com.example.demo1.pojo.NewsCategory;

import java.util.List;

/**
 * @author 孙国鹏
 * @date 2021/3/17 8:44
 */
public interface NewsDao {

    /**
     * 根据新闻类别编号查询新闻
     * @param pressCategory 新闻类别
     * @return 返回News集合
     */
    public List<News> queryNewsByPressCategory(String pressCategory);

    /**
     * 根据新闻类别编号查询新闻类别名称
     * @param pressCategory 新闻类别
     * @return 返回NewsCategory
     */
    public NewsCategory queryNewsCategoryByPressCategory(String pressCategory);

    /**
     * 查询所有新闻类别
     * @return
     */
    public List<NewsCategory> queryNewsCategory();

    /**
     * 获取所有新闻
     * @return 返回List<News>
     */
    public List<News> queryNewsAll();
}
