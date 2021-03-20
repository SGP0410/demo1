package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetUserAdviceDaoImpl;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/19 8:55 星期五
 */

/**
 * 提交用户反馈
 *  {"title":"222","content":"iiiii","userId":"1","createTime":"2021-02-12"}
 */

@WebServlet(name = "setuseradvice",value = "/setuseradvice")
public class SetUserAdvice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int a = new GetUserAdviceDaoImpl().querysetUserAdvice(jsonObject.getString("title"),jsonObject.getString("content"),
                jsonObject.getString("userId"),jsonObject.getString("createTime"));

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

}
