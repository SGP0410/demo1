package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 14:38
 */

import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "getUserByUserId", value = "/getUserByUserId")
public class GetUserByUserId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.queryUserByUserId(jsonObject.optInt("id"));

        JSONObject jsonObject1 = new JSONObject();
        if (user != null){
            ServletUtils.isOk(jsonObject1 , true);
            jsonObject1.put("id" , user.getId());
            jsonObject1.put("userName" , user.getUserName());
            jsonObject1.put("nickName" , user.getNickName());
            jsonObject1.put("phonenumber" , user.getPhonenumber());
            jsonObject1.put("sex" , userDao.querySexBySexId(user.getSex()).getSexName());
            jsonObject1.put("email" , user.getEmail());
            jsonObject1.put("avatar" , ServletUtils.getImageUrl(request , user.getAvatar()));
            jsonObject1.put("idCard" , user.getIdCard());
        }else {
            ServletUtils.isOk(jsonObject1 , false);
        }
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
