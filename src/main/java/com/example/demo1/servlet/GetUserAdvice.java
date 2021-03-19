package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetUserAdviceDaoImpl;
import com.example.demo1.pojo.UserAdvice;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/19 8:30 星期五
 */

/**
 * 查询所有意见反馈
 */
@WebServlet(name = "getuserAdvice" ,value = "/getuserAdvice")
public class GetUserAdvice extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        List<UserAdvice> advices = new GetUserAdviceDaoImpl().queryUserAdvice();

        JSONObject jsonObject = new JSONObject();

        if (advices != null){
            ServletUtils.isOk(jsonObject,true);
            JSONArray jsonArray = new JSONArray();
            for (UserAdvice advice : advices){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,advice);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("total",advices.size());
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }

        resp.getWriter().write(jsonObject.toString());


    }

    protected void myDoGet(JSONObject jsonObject1, UserAdvice advice){
        jsonObject1.put("id",advice.getId());
        jsonObject1.put("userId",advice.getUserId());
        jsonObject1.put("Content",advice.getContent());
        jsonObject1.put("title",advice.getTitle());
        jsonObject1.put("createtime",advice.getCreateTime());
    }


}
