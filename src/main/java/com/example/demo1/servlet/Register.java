package com.example.demo1.servlet;

import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "register", value = "/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject jsonObject = ServletUtils.Setting(request, response);

        User user = new User(
                jsonObject.optString("userName"),
                jsonObject.optString("password"),
                jsonObject.optString("nickName"),
                jsonObject.optString("phonenumber"),
                jsonObject.optInt("sex"),
                "","",""
        );
        UserDaoImpl userDao = new UserDaoImpl();
        JSONObject jsonObject1 = new JSONObject();
        if (userDao.saveUser(user) != -1){
            jsonObject1.put("msg" , "操作成功");
            jsonObject1.put("code" , "200");
        }else {
            jsonObject1.put("msg" , "操作失败");
            jsonObject1.put("code" , "500");
        }
        response.getWriter().write(jsonObject1.toString());
    }
}
