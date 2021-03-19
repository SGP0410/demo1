package com.example.demo1.dao.impl;

import com.example.demo1.dao.UserDao;
import com.example.demo1.pojo.Sex;
import com.example.demo1.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserByUserName(String userName) {
        String sql = "select * from user where userName = ?";
        return queryForOne(User.class , sql , userName);
    }

    @Override
    public User queryUserByUserNameAndPassword(String userName, String password) {
        String sql = "select * from user where userName = ? and password = ?";
        return queryForOne(User.class , sql , userName , password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into user(userName,password,nickName,phonenumber,sex,email,avatar,idCard) values(?,?,?,?,?,?,?,?)";
        return update(sql ,
                user.getUserName() ,
                user.getPassword(),
                user.getNickName(),
                user.getPhonenumber(),
                user.getSex(),
                user.getEmail(),
                user.getAvatar(),
                user.getIdCard());
    }

    @Override
    public User queryUserByUserId(int id) {
        String sql = "select * from user where id = ?";
        return queryForOne(User.class , sql , id);
    }

    @Override
    public Sex querySexBySexId(int sexId) {
        String sql = "select * from sex where sexId = ?";
        return queryForOne(Sex.class , sql , sexId);
    }

    @Override
    public int updateUser(User user) {
        System.out.println(user.toString());
        String sql = "update user set idCard = ?,userName = ?,nickName = ?,email = ?,phonenumber =?," +
                "sex = ?,avatar = ? where id = ?";
        System.out.println(user.toString());
        return update(sql , user.getIdCard() , user.getUserName() , user.getNickName() ,
                user.getEmail() , user.getPhonenumber() , user.getSex() , user.getAvatar() , user.getId());
    }

    @Override
    public int updatePassword(int id, String userName, String password) {
        String sql = "update user set password = ? where id = ? and userName = ?";
        return update(sql , password , id , userName);
    }
}