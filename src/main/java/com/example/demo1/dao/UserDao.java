package com.example.demo1.dao;

import com.example.demo1.pojo.Sex;
import com.example.demo1.pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return 如果返回null说明没有这个用户
     */
    public User queryUserByUserName(String userName);
    /**
     * 根据用户名和密码查询用户信息
     * @param userName 用户名
     * @param password 密码
     * @return 如果返回null说明用户名或密码错误
     */
    public User queryUserByUserNameAndPassword(String userName , String password);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户Id查询用户信息
     * @param id
     * @return
     */
    public User queryUserByUserId(int id);

    /**
     * 根据sexId获取Sex
     * @param sexId
     * @return
     */
    public Sex querySexBySexId(int sexId);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 修改用户密码
     * @param id 用户id
     * @param userName 用户名
     * @param password 用户密码
     * @return
     */
    public int updatePassword(int id , String userName , String password);
}
