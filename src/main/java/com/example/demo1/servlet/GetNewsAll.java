package com.example.demo1.servlet;
/**
 * @author 孙国鹏
 * @date 2021/3/17 10:51
 */

import com.example.demo1.dao.impl.NewsDaoImpl;
import com.example.demo1.pojo.News;
import com.example.demo1.pojo.NewsCategory;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getNewsAll", value = "/getNewsAll")
public class GetNewsAll extends NewsByPressCategory {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        NewsDaoImpl newsDao = new NewsDaoImpl();
        List<News> newsList = newsDao.queryNewsAll();
        myDoGet(request , response , newsList , newsDao);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
