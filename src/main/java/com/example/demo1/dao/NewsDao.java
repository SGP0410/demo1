package com.example.demo1.dao;

import com.example.demo1.pojo.Comment;
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

    /**
     * 根据新闻编号查询评论
     * @return 返回所有评论
     */
    public List<Comment> queryComment(int pressId);

    /**
     * 添加评论
     * @param userId 用户id
     * @param pressId 新闻id
     * @param content 评论内容
     * @param createTime 评论时间
     * @return 返回值不为-1则添加成功
     */
    public int addComment(int userId , int pressId , String content , String createTime);
}
