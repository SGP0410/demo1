package com.example.demo1.dao.impl;

import com.example.demo1.dao.UserAdviceDao;
import com.example.demo1.pojo.UserAdvice;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/19 8:35 星期五
 */

public class GetUserAdviceDaoImpl extends BaseDao implements UserAdviceDao {

    /**
     *  查询所有反馈意见
     * @return
     */
    @Override
    public List<UserAdvice> queryUserAdvice() {
        String sql = "select * from useradvice";
        return queryForList(UserAdvice.class,sql);
    }

    /**
     * @param title         标题
     * @param content       内容
     * @param userId        用户id
     * @param createTime    提交时间
     * @return
     */
    public int querysetUserAdvice(String title, String content, String userId, String createTime) {
        String sql = "INSERT INTO useradvice(title,content,userId,createTime) VALUES (?,?,?,?)";
        return update(sql,title,content,userId,createTime);
    }
}
