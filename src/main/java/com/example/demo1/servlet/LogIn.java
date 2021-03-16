package com.example.demo1.servlet;

import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ServletUtils;
import com.example.demo1.utils.ToKen;
import org.json.JSONObject;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/login")
public class LogIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject jsonObject = ServletUtils.Setting(request, response);

        //查询数据
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.queryUserByUserNameAndPassword(jsonObject.optString("userName"),
                jsonObject.optString("password"));

        //处理并返回结果
        JSONObject jsonObject1 = new JSONObject();
        PrintWriter writer = response.getWriter();
        if (user != null){
            jsonObject1.put("msg" , "操作成功");
            jsonObject1.put("code" , "200");
            ToKen.createToken();
            jsonObject1.put("token" , ToKen.getToKen());
        }else {
            jsonObject1.put("msg" , "操作失败");
            jsonObject1.put("code" , "500");

        }
        writer.write(jsonObject1.toString());
    }
}
