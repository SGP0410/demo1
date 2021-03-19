package com.example.demo1.dao;

import com.example.demo1.pojo.UserAdvice;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/19 8:36 星期五
 */

public interface UserAdviceDao {

    /**
     * 查询所有意见反馈列表
     * @return
     */
    public List<UserAdvice> queryUserAdvice();

    /**
     * 提交反馈意见
     * @param title         标题
     * @param content       内容
     * @param userId        用户id
     * @param createTime    提交时间
     * @return
     */
    public int querysetUserAdvice(String title, String content, String userId, String createTime);

}
